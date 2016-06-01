package com.fire.tutorialmod.Proxies;

import com.fire.tutorialmod.Init.InitItems;

public class ClientProxy extends CommonProxy {
	public void registerRenderInfo(){
		InitItems.registerRenders();
	}
}
