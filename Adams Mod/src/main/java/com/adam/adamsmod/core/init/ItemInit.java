package com.adam.adamsmod.core.init;

import com.adam.adamsmod.AdamsMod;
import com.adam.adamsmod.common.material.USAToolMaterial;
import com.adam.adamsmod.core.itemgroup.AdamsModItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdamsMod.MOD_ID);

	public static final RegistryObject<Item> USA_INGOT = ITEMS.register("usa_ingot",
			() -> new Item(new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	// first number damage, second attack speed
	public static final RegistryObject<Item> USA_SWORD = ITEMS.register("usa_sword",
			() -> new SwordItem(USAToolMaterial.USA_SWORD, 8, -1.6f, new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_AXE = ITEMS.register("usa_axe",
			() -> new AxeItem(USAToolMaterial.USA_AXE, 9, -1f, new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_PICKAXE = ITEMS.register("usa_pickaxe",
			() -> new PickaxeItem(USAToolMaterial.USA_PICKAXE, 6, -1.2f, new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_SHOVEL = ITEMS.register("usa_shovel",
			() -> new ShovelItem(USAToolMaterial.USA_SHOVEL, 6, -1f, new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_HOE = ITEMS.register("usa_hoe",
			() -> new HoeItem(USAToolMaterial.USA_HOE, 2, -2f, new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));
}
