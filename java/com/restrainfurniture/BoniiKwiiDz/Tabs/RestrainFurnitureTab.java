package com.restrainfurniture.BoniiKwiiDz.Tabs;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RestrainFurnitureTab extends CreativeTabs {
    public RestrainFurnitureTab(){
        super(RestrainMod.MODID);
       // this.setBackgroundImageName("rest_tab.png");
    }

    //@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(RestrainMod.unlock_key);
	}

}