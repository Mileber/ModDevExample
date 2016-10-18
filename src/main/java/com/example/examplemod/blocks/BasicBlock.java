package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block{
	
	/**三个构造函数：
	* 1. 所有参数都需要传入
	* 2. 只传入名字，硬度，持久度时，默认材质为Rock
	* 3. 只传入名字，后两项为默认值
	*/
	public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
	
	//直接传入材质为Rock
	public BasicBlock(String unlocalizedName, float hardness, float resistance){
		this(unlocalizedName, Material.ROCK,hardness,resistance);
	}

	public BasicBlock(String unlocalizedName){
		this(unlocalizedName, 2.0f, 10.0f);
	}
}
