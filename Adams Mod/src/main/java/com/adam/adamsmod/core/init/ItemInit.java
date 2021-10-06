package com.adam.adamsmod.core.init;

import com.adam.adamsmod.AdamsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdamsMod.MOD_ID);

	public static final RegistryObject<Item> USA_SWORD = ITEMS.register("usa_sword",
			() -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));
}
