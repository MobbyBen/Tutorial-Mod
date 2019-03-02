package com.MobbyBen.TutorialMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AmethystBlock extends BlockBase
{

	public AmethystBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
}
