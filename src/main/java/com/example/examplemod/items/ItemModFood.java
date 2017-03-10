package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModFood extends ItemFood{
	
	public ItemModFood(String unlocalizedName, int healAmount, float saturationModfier, boolean wolvesFavorite){
		super(healAmount, saturationModfier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.FOOD);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
		
		if(!worldIn.isRemote){
			player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("jump_boost"), 600, 0));
			player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"),1200, 1));
			player.addExperience(20);
		}
	}
	
	

}
