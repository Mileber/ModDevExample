package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block myFirstBlock;
	
	public static void createBlocks(){
		GameRegistry.registerBlock(myFirstBlock = new BasicBlock("my_first_block").setLightLevel(1.0f), "my_first_block");
	}

}
