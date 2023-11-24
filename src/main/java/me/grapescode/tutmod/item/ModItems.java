package me.grapescode.tutmod.item;

import me.grapescode.tutmod.TutMod;
import me.grapescode.tutmod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = RegisterItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = RegisterItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item RUBY_HELMET = RegisterItem("ruby_helmet", new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item RUBY_CHESTPLATE = RegisterItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item RUBY_LEGGINGS = RegisterItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item RUBY_BOOTS = RegisterItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TOMATO = RegisterItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));

    public static final Item BLUEBERRY = RegisterItem("blueberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY)));

    private static void addItemsToTab(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(RUBY_HELMET);
        entries.add(RUBY_CHESTPLATE);
        entries.add(RUBY_LEGGINGS);
        entries.add(RUBY_BOOTS);
    }

    private static void addFood(FabricItemGroupEntries entries) {
        entries.add(TOMATO);
        entries.add(BLUEBERRY);
    }

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutMod.MOD_ID, name), item);
    }
    public static void RegisterItems() {
        TutMod.LOGGER.info("[LEYENDAS] Registrando items...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addFood);
    }
}
