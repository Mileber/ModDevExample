package com.example.examplemod.items;

import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword{
	
	//构造函数
	public ItemModSword(String unlocalizedName, ToolMaterial material){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}
