package com.MobbyBen.TutorialMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.AMETHYST, new ItemStack(ModItems.AMETHYST_DUST, 1), 0.5f);
	}
	
}
