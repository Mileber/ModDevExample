package com.example.examplemod.items;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModHoe extends ItemHoe {
	
	//构造函数
	public ItemModHoe(String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}
