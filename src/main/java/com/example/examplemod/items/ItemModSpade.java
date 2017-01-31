package com.example.examplemod.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModSpade extends ItemSpade{

	//构造函数
	public ItemModSpade(String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}
}
