package com.fire.tutorialmod.Init;

import com.fire.tutorialmod.Items.itemTest;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitItems {
	
	public static Item itemTest;

	public static void init(){
		itemTest = new itemTest("itemTest").setCreativeTab(CreativeTabs.tabMisc);
		register();
	}
	
	public static void register(){
		GameRegistry.register(itemTest);
	}
	
	public static void registerRenders(){
		registerRender(itemTest);
	}
	
	public static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
