package com.restrainfurniture.BoniiKwiiDz.Events;

import java.util.List;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;
import com.restrainfurniture.BoniiKwiiDz.objects.Blocks.Bshapex;
import com.restrainfurniture.BoniiKwiiDz.Entities.bPosableShape;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer.*;
import net.minecraft.potion.*;

@Mod.EventBusSubscriber(modid = RestrainMod.MODID)
public class SeatEvent{
	public SeatEvent(){
		RestrainMod.logger.info("event started");
	}
    @SubscribeEvent
	public static void onInteractWithBlock(PlayerInteractEvent.RightClickBlock event){
		EntityPlayer player = event.getEntityPlayer();
		World current_w = event.getWorld();

		if(player.getRidingEntity() != null){
			return;
		}
		BlockPos pos = event.getPos();
		Vec3d vec = new Vec3d(pos.getX()+0.5,pos.getY(),pos.getZ()+0.5);
		double maxDist = 2.0;
		if((vec.x - player.posX) * (vec.x - player.posX) + (vec.y - player.posY) * (vec.y - player.posY) + (vec.z - player.posZ) * (vec.z - player.posZ) > maxDist * maxDist){
			return;
		}

		IBlockState state = current_w.getBlockState(pos);
		ItemStack mainStack = player.getHeldItemMainhand();
		ItemStack offStack = player.getHeldItemOffhand();
		if(!mainStack.isEmpty() || !offStack.isEmpty()){
			return;
		}
		
		if(state.getBlock() instanceof Bshapex){
			bPosableShape dummy = new bPosableShape(current_w, player.getDisplayName().getUnformattedText(), "", vec, vec);
			SeatMachine seat = new SeatMachine(current_w, pos,player, dummy);
			current_w.spawnEntity(seat);
			current_w.spawnEntity(dummy);
			player.startRiding(seat);
			player.addPotionEffect((new PotionEffect(Potion.getPotionById(14), Integer.MAX_VALUE, -42)));
		}
		//RestrainMod.logger.info("block was interacted");
		//EntityPlayer player = (EntityPlayer) event.getEntityPlayer();
		//System.out.println("interaction happened AAAAAAAAAAAA");
	}

	public static class SeatMachine extends Entity{
		EntityPlayer player;
		bPosableShape fake_own;
		public SeatMachine(World current_wrl, BlockPos posw, EntityPlayer own, bPosableShape fk_own){
			this(current_wrl);
			player = own;
			fake_own = fk_own;
			setPosition(posw.getX() + 0.5D, posw.getY() + 0.3D, posw.getZ() + 0.5D);
		}

		public SeatMachine(World current_wrl/*, EntityPlayer own*/){
			super(current_wrl);
			//player = own;
			setSize(0.0F,0.0F);
		}

		@Override
		public void onUpdate(){
			super.onUpdate();
			BlockPos pos = getPosition();
			if(!(getEntityWorld().getBlockState(pos).getBlock() instanceof Bshapex)){
				setDead();
			}
			List<Entity> passengers = getPassengers();
			if(passengers.isEmpty())
			{
				setDead();
			}
			for(Entity entity : passengers){
				if(entity.isSneaking())
				{
					player.removePotionEffect(Potion.getPotionById(14));
					fake_own.setDead();
					setDead();
				}
			}
		}
		@Override
		protected void entityInit() 
		{
			
		}

		@Override
		protected void readEntityFromNBT(NBTTagCompound compound) 
		{
			
		}

		@Override
		protected void writeEntityToNBT(NBTTagCompound compound) 
		{
			
		}
	}

}