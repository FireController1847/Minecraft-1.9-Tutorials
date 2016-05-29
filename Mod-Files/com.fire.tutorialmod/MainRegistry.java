package com.fire.tutorialmod;

import org.apache.logging.log4j.Logger;

import com.fire.tutorialmod.Proxies.ClientProxy;
import com.fire.tutorialmod.Proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = Strings.CLIENTPROXY, serverSide = Strings.COMMONPROXY)
	public static CommonProxy proxy;
	public static ClientProxy cproxy;
	
	@Instance(Strings.MODID)
	public static MainRegistry instance;
	
	public static Logger logger;
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event){
		logger = event.getModLog();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public void Load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent event){
		
	}
}
