package com.example.examplemod.crafting;

import com.example.examplemod.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void initCrating(){
		
		//1. 有序合成
		GameRegistry.addRecipe(new ItemStack(ModItems.ApplePen), "a  "," b ",'a',ModItems.Pen,'b',Items.APPLE);
		
		//2. 无序合成
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PineapplePen), new Object[]{ModItems.Pineapple,ModItems.Pen});
		
		//3. 熔炉合成
		GameRegistry.addSmelting(ModItems.ApplePen, new ItemStack(ModItems.Pen), 1.0F);
		GameRegistry.addSmelting(ModItems.PineapplePen, new ItemStack(ModItems.Pineapple), 1.0F);
	}
	
}
