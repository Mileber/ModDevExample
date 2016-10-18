package com.example.examplemod.client.render.blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static String modid = ExampleMod.MODID;
	
	public static void registerBlockRender(){
		reg(ModBlocks.myFirstBlock);
	}

	public static void reg(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid+":"+block.getUnlocalizedName().substring(5),"inventory"));
	}
}
