package com.restrainfurniture.BoniiKwiiDz.objects.Items;

import com.restrainfurniture.BoniiKwiiDz.RestrainMod;
import com.restrainfurniture.BoniiKwiiDz.Tabs.RestrainFurnitureTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class UnlockKey extends ItemSword {
 public UnlockKey() {
  super(RestrainMod.keyMaterial);
   this.setRegistryName("unlock_key");
   this.setUnlocalizedName("unlock_key");
   this.setCreativeTab(RestrainMod.RESTRAIN_TAB);
 }
}
