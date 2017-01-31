package com.example.examplemod.items;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModPickaxe extends ItemPickaxe{

	//构造函数
	public ItemModPickaxe(String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}
