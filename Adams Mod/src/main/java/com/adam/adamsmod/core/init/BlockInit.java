package com.adam.adamsmod.core.init;

import com.adam.adamsmod.AdamsMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			AdamsMod.MOD_ID);

	public static final RegistryObject<Block> USA_ORE = BLOCKS.register("usa_ore",
			() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
	
	public static final RegistryObject<Block> USA_BLOCK = BLOCKS.register("usa_block",
			() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
}
