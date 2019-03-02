package com.MobbyBen.TutorialMod.Items.tools;

import com.MobbyBen.TutorialMod.Main;
import com.MobbyBen.TutorialMod.init.ModItems;
import com.MobbyBen.TutorialMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	
	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
