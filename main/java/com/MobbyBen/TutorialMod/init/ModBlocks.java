package com.MobbyBen.TutorialMod.init;

import java.util.ArrayList;
import java.util.List;

import com.MobbyBen.TutorialMod.blocks.AmethystBlock;
import com.MobbyBen.TutorialMod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block AMETHYST_BLOCK = new AmethystBlock("amethyst_block", Material.IRON);
}
