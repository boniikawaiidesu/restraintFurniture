package com.restrainfurniture.BoniiKwiiDz.Entities;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;
import com.restrainfurniture.BoniiKwiiDz.threads.DownloadImg;
import com.restrainfurniture.BoniiKwiiDz.Tabs.RestrainFurnitureTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.entity.EntityAgeable;

public class bPosableShape extends Entity {
    public bPosableShape(World dim, String name, String anim,Vec3d position, Vec3d rotation){
        this(dim);
        //download_skin(name);
        DownloadImg skin_hot = new DownloadImg(name);
        System.out.println("Started fake entity...");
    }

    public bPosableShape(World dim){
        super(dim);
    }

    @Override
	protected void entityInit() 
	{
			
	}

    @Override
	public void onUpdate(){
			
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