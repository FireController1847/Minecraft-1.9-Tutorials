package com.fire.tutorialmod.Items;

import com.fire.tutorialmod.Strings;

import net.minecraft.item.Item;

public class itemTest extends Item {

	public itemTest(String name){
		this.setUnlocalizedName(name);
		this.setRegistryName(Strings.MODID, name);
	}
	
}
