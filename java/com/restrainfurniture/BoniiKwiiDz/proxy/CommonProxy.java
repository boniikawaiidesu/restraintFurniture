package com.restrainfurniture.BoniiKwiiDz.proxy;

import java.util.ArrayList;
import java.util.List;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
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
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.ModelRegistryEvent;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
public class CommonProxy{
 @SubscribeEvent
 public static void registerItems(RegistryEvent.Register<Item> event){
  event.getRegistry().registerAll(RestrainMod.unlock_key);
  for(int i = 0; i < RestrainMod.ITEMS.size(); i++){
      event.getRegistry().registerAll(RestrainMod.ITEMS.get(i));
  }
  RestrainMod.logger.info("items have been registered OwE");
 }
 
 @SubscribeEvent
 public static void registerBlocks(RegistryEvent.Register<Block> event){
  for(int i = 0; i < RestrainMod.BLOCKS.size(); i++){
      event.getRegistry().registerAll(RestrainMod.BLOCKS.get(i));
  }
 }

 public static void registerItemRenderer(Item item) {
  ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
  RestrainMod.logger.info("Register item location occurred OwU");
 }

 @SubscribeEvent
 public static void registerModels(ModelRegistryEvent event/*, Item item*/) {
  registerItemRenderer(RestrainMod.unlock_key);
  for(int i = 0; i < RestrainMod.ITEMS.size(); i++){
      registerItemRenderer(RestrainMod.ITEMS.get(i));
  }
  for(int i = 0; i < RestrainMod.BLOCKS.size(); i++){
      registerItemRenderer(Item.getItemFromBlock(RestrainMod.BLOCKS.get(i)));
  }
  RestrainMod.logger.info("Register models occurred OwO");
 // ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
 }
}
