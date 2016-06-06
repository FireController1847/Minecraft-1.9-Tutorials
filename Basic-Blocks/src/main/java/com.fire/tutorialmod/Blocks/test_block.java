package com.fire.tutorialmod.Blocks;

import com.fire.irony.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class test_block extends Block {

	public test_block(Material materialIn, String name, CreativeTabs tab) {
		super(materialIn);
		this.setRegistryName(Strings.MODID, name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
	}

}
