package com.adam.adamsmod.core.init;

import com.adam.adamsmod.AdamsMod;
import com.adam.adamsmod.common.material.USAArmorMaterial;
import com.adam.adamsmod.common.material.USAToolMaterial;
import com.adam.adamsmod.core.itemgroup.AdamsModItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
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

	// tools & weapons
	public static final RegistryObject<Item> USA_SWORD = ITEMS.register("usa_sword",
			() -> new SwordItem(USAToolMaterial.USA_SWORD, 8, -1.6f,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_AXE = ITEMS.register("usa_axe",
			() -> new AxeItem(USAToolMaterial.USA_AXE, 9, -1f,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_PICKAXE = ITEMS.register("usa_pickaxe",
			() -> new PickaxeItem(USAToolMaterial.USA_PICKAXE, 6, -1.2f,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_SHOVEL = ITEMS.register("usa_shovel",
			() -> new ShovelItem(USAToolMaterial.USA_SHOVEL, 6, -1f,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_HOE = ITEMS.register("usa_hoe",
			() -> new HoeItem(USAToolMaterial.USA_HOE, 2, -2f,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	// armor
	public static final RegistryObject<Item> USA_HELMET = ITEMS.register("usa_helmet",
			() -> new ArmorItem(USAArmorMaterial.USA_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_CHESTPLATE = ITEMS.register("usa_chestplate",
			() -> new ArmorItem(USAArmorMaterial.USA_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_LEGGINGS = ITEMS.register("usa_leggings",
			() -> new ArmorItem(USAArmorMaterial.USA_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	public static final RegistryObject<Item> USA_BOOTS = ITEMS.register("usa_boots",
			() -> new ArmorItem(USAArmorMaterial.USA_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)));

	// food
	public static final RegistryObject<Item> CRUNCHY_TACO = ITEMS.register("crunchy_taco",
			() -> new Item(new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)
					.food(new Food.Builder().hunger(5).saturation(6f).build())));

	public static final RegistryObject<Item> BEEFY_FIVE_LAYER_BURRITO = ITEMS.register("beefy_five_layer_burrito",
			() -> new Item(new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)
					.food(new Food.Builder().hunger(6).saturation(12.8f).build())));
	
	public static final RegistryObject<Item> BAJA_BLAST_FREEZE = ITEMS.register("baja_blast_freeze",
			() -> new Item(new Item.Properties().group(AdamsModItemGroup.ADAMS_MOD)
					.food(new Food.Builder().hunger(4).saturation(6f).build())));
}
