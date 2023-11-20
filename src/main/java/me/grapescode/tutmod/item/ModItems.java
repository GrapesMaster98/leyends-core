package me.grapescode.tutmod.item;

import me.grapescode.tutmod.TutMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = RegisterItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = RegisterItem("raw_ruby", new Item(new FabricItemSettings()));

    private static void addItemsToTab(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutMod.MOD_ID, name), item);
    }
    public static void RegisterItems() {
        TutMod.LOGGER.info("[LEYENDAS] Registrando items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToTab);
    }
}
