package net.casualpasserby.learningtomod.item;

import net.casualpasserby.learningtomod.LearningToMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Add new items here like this //
    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LearningToMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LearningToMod.LOGGER.info("Registering ModItems for " + LearningToMod.MOD_ID);

        // Register new items here and add them to the creative menu //
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST_ITEM);
        });

    }
}
