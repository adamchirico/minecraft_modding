package com.adam.adamsmod.common.material;

import java.util.function.Supplier;
import com.adam.adamsmod.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum USAToolMaterial implements IItemTier {

	USA_SWORD(0, 1776, 15f, 2f, 17, () -> Ingredient.fromItems(ItemInit.USA_INGOT.get())),
	USA_AXE(0, 1776, 15f, 2f, 17, () -> Ingredient.fromItems(ItemInit.USA_INGOT.get())),
	USA_PICKAXE(4, 1776, 15f, 2f, 17, () -> Ingredient.fromItems(ItemInit.USA_INGOT.get())),
	USA_SHOVEL(0, 1776, 15f, 2f, 17, () -> Ingredient.fromItems(ItemInit.USA_INGOT.get())),
	USA_HOE(0, 1776, 15f, 2f, 17, () -> Ingredient.fromItems(ItemInit.USA_INGOT.get()));
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	USAToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}
	
	@Override
	public int getMaxUses() {
		return this.maxUses;
	}
	@Override
	public float getEfficiency() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	@Override
	public int getEnchantability() {
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial;
	}

	
}
