package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item MyFirstItem;
	public static Item Pineapple;
	public static Item Pen;
	public static Item ApplePen;
	public static Item PineapplePen;
	
	public static Item tutorialPickaxe;
	public static Item tutorialAxe;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialSword;
	
	public static Item babaoDuck;
	
	public static void createItems(){
		GameRegistry.registerItem(MyFirstItem = new BasicItem("my_first_item").setRegistryName("my_first_item"));
		//for ppap
		GameRegistry.registerItem(Pineapple = new BasicItem("pineapple"),"pineapple");
		GameRegistry.registerItem(Pen = new BasicItem("pen"),"pen");
		GameRegistry.registerItem(ApplePen = new BasicItem("apple_pen"),"apple_pen");
		GameRegistry.registerItem(PineapplePen = new BasicItem("pineapple_pen"),"pineapple_pen");
		
		//工具
		GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
		GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
		GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
		GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");
		
		//食物
		GameRegistry.registerItem(babaoDuck = new ItemModFood("babao_duck", 8, 1.2f, false
				).setAlwaysEdible(), "babao_duck");
	}
	
	//各个工具通用的ToolMaterial
	public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 2000, 15.0F, 6.0F, 100);
}
