package com.fire.tutorialmod.Proxies;

import com.fire.tutorialmod.Init.InitBlocks;
import com.fire.tutorialmod.Init.InitItems;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo(){
		InitItems.registerRenders();
		InitBlocks.Render();
	}
}
