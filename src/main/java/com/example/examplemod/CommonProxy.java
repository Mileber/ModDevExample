package com.example.examplemod;

import com.example.examplemod.blocks.ModBlocks;
import com.example.examplemod.crafting.ModCrafting;
import com.example.examplemod.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {
    	ModCrafting.initCrating();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
