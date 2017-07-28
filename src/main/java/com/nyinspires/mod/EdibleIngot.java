package com.nyinspires.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;

public class EdibleIngot extends ItemFood {
	public EdibleIngot() {
		super(5, 1.0F, true);
		this.setAlwaysEdible();
		this.setUnlocalizedName("enderIngot");
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
}
