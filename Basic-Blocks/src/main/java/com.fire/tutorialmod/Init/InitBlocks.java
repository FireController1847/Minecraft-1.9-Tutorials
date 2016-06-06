package com.fire.tutorialmod.Init;

import com.fire.tutorialmod.Blocks.test_block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitBlocks {
	
	public static Block test_block;
	
	public static void Create(){
		test_block = new test_block(Material.ROCK, "test_block", CreativeTabs.BUILDING_BLOCKS);
		Register();
	}
	
	public static void Register(){
		RegisterBlock(test_block);
	}
	
	public static void Render(){
		RegisterItem(Item.getItemFromBlock(test_block));
	}
	
	public static void RegisterItem(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void RegisterBlock(Block block){
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
}
