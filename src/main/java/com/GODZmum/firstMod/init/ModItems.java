package com.GODZmum.firstMod.init;

import com.GODZmum.firstMod.item.ItemMapleLeaf;
import com.GODZmum.firstMod.item.ItemFirstMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final ItemFirstMod mapleLeaf = new ItemMapleLeaf();
			
			public static void init(){
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}