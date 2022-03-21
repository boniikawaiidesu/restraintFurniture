package com.restrainfurniture.BoniiKwiiDz;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.restrainfurniture.BoniiKwiiDz.objects.Items.UnlockKey;
import com.restrainfurniture.BoniiKwiiDz.proxy.CommonProxy;
import com.restrainfurniture.BoniiKwiiDz.Tabs.RestrainFurnitureTab;
import com.restrainfurniture.BoniiKwiiDz.objects.Blocks.Bshapex;
//import com.restrainfurniture.BoniiKwiiDz.Events.SeatEvent;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = RestrainMod.MODID, name = RestrainMod.NAME, version = RestrainMod.VERSION)
public class RestrainMod
{
    //
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final String MODID = "restraintfmod";
    public static final String NAME = "Restraint furniture Mod";
    public static final String VERSION = "1.0";

    public static Logger logger;
    
    //public static SeatEvent eventh = new SeatEvent();

    public static ToolMaterial keyMaterial;
    public static Item unlock_key;

    public static final CreativeTabs RESTRAIN_TAB = new RestrainFurnitureTab();

    public static final Block FT_XSHAPE = new Bshapex("furniture_shapex", Material.GOURD);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        keyMaterial = EnumHelper.addToolMaterial("Unlock Key furniture", 13, 2000, 23, 0, 0);
        unlock_key = new UnlockKey();
        //CommonProxy.registerModels();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//CommonProxy.registerRender();
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
