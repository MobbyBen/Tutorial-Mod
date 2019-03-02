package com.MobbyBen.TutorialMod.init;

import java.util.ArrayList;
import java.util.List;

import com.MobbyBen.TutorialMod.Items.ItemBase;
import com.MobbyBen.TutorialMod.Items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 2, 1000, 7.0F, 2.5F, 15);
	
	//Items
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item AMETHYST_DUST = new ItemBase("amethyst_dust");
	
	//Tools
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
}
