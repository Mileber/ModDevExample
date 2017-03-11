package com.example.examplemod.crafting;

import com.example.examplemod.items.ModItems;

import net.minecraft.command.EntitySelector;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
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
		
		//other:生成刷怪蛋
		ItemStack egg_pig = new ItemStack(Items.SPAWN_EGG, 1);
		applyEntityIdToItemStack_local(egg_pig, EntityList.getEntityStringFromClass(EntityPig.class));
		GameRegistry.addRecipe(egg_pig, "a  ","  b",'a',ModItems.Pen,'b',Items.DIAMOND);
		
		ItemStack egg_creeper = new ItemStack(Items.SPAWN_EGG, 1);
		applyEntityIdToItemStack_local(egg_creeper, EntityList.getEntityStringFromClass(EntityCreeper.class));
		GameRegistry.addRecipe(egg_creeper, "a  ","  b",'a',ModItems.Pen,'b',Items.BAKED_POTATO);
		
		ItemStack egg_villager = new ItemStack(Items.SPAWN_EGG, 1);
		applyEntityIdToItemStack_local(egg_villager, EntityList.getEntityStringFromClass(EntityVillager.class));
		GameRegistry.addRecipe(egg_villager, "a  ","  b",'a',ModItems.Pen,'b',Items.APPLE);
	}
	
	public static void applyEntityIdToItemStack_local(ItemStack stack, String entityId)
    {
        NBTTagCompound nbttagcompound = stack.hasTagCompound() ? stack.getTagCompound() : new NBTTagCompound();
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.setString("id", entityId);
        nbttagcompound.setTag("EntityTag", nbttagcompound1);
        stack.setTagCompound(nbttagcompound);
    }
	
}
