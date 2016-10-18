package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item MyFirstItem;
	public static Item Pineapple;
	public static Item Pen;
	public static Item ApplePen;
	public static Item PineapplePen;
	
	public static void createItems(){
		GameRegistry.registerItem(MyFirstItem = new BasicItem("my_first_item"),"my_first_item");
		//for ppap
		GameRegistry.registerItem(Pineapple = new BasicItem("pineapple"),"pineapple");
		GameRegistry.registerItem(Pen = new BasicItem("pen"),"pen");
		GameRegistry.registerItem(ApplePen = new BasicItem("apple_pen"),"apple_pen");
		GameRegistry.registerItem(PineapplePen = new BasicItem("pineapple_pen"),"pineapple_pen");
	}
}
