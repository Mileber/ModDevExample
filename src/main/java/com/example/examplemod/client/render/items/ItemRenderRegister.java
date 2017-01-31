package com.example.examplemod.client.render.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static String modid = ExampleMod.MODID;
	
	public static void registerItemRenderer(){
		reg(ModItems.MyFirstItem);
		reg(ModItems.Pineapple);
		reg(ModItems.ApplePen);
		reg(ModItems.Pen);
		reg(ModItems.PineapplePen);
		reg(ModItems.tutorialAxe);
		reg(ModItems.tutorialHoe);
		reg(ModItems.tutorialPickaxe);
		reg(ModItems.tutorialSpade);
		reg(ModItems.tutorialSword);
	}
	
	public static void reg(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}
}
