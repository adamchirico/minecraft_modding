package com.adam.adamsmod.core.itemgroup;

import com.adam.adamsmod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AdamsModItemGroup extends ItemGroup {

	public static final AdamsModItemGroup ADAMS_MOD = new AdamsModItemGroup(ItemGroup.GROUPS.length, "adams_mod");

	public AdamsModItemGroup(int index, String label) {
		super(index, label);

	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.USA_SWORD.get());
	}

}
