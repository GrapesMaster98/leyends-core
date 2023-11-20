package me.grapescode.tutmod;

import me.grapescode.tutmod.block.ModBlocks;
import me.grapescode.tutmod.item.ModItemGroups;
import me.grapescode.tutmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutMod implements ModInitializer {

	public static final String MOD_ID = "tutmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//Registro items
		ModItems.RegisterItems();
		ModItemGroups.RegisterItemGroups();

		//Registro bloques
		ModBlocks.RegisterBlocks();
	}
}