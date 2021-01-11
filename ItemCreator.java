/*
 * Copyright (c) This Class was Created by GoodyFX dedicated to Dream-Craft.de
 */

//Your Package PATH!!!!
//Some functions are not available in later builds!
package eu.goodyfx.jobs.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Map;

@SuppressWarnings({"deprecation", "unused"})
public class ItemCreator {



    /*
    EXAMPLE//

    List<String> lore = new ArrayList<>();
    Map<Enchantment, Integer> enchants = new HashMap<>();

    enchants.add(ExampleEnchant, 200);

    lore.add("Text1");
    lore.add("Text2");

    ItemStack stack = ItemCreator.createItem(Material.IRON_PICKAXE, 1, "§cCool Example", lore, enchants);
     */

    //--------------------------------------------------------------------------------------------\\

    //Create Items

    public static ItemStack createItem(Material type, int amount, String displayName, List<String> lore, Map<Enchantment, Integer> enchantments) {
        ItemStack itemStack = new ItemStack(type, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        itemStack.addUnsafeEnchantments(enchantments);
        return itemStack;
    }

    public static ItemStack createItem(Material type, int amount, String displayName, List<String> lore) {
        ItemStack itemStack = new ItemStack(type, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack createItem(Material type, int amount, String displayName) {
        ItemStack itemStack = new ItemStack(type, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack createItem(Material type, int amount) {
        return new ItemStack(type, amount);
    }


    //Create Items with Meta!

    public static ItemStack createMetaItem(Material type, int amount, short iD, String displayName, List<String> lore, Map<Enchantment, Integer> enchantments) {
        ItemStack itemStack = new ItemStack(type, amount, iD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        itemStack.addUnsafeEnchantments(enchantments);
        return itemStack;
    }

    public static ItemStack createMetaItem(Material type, int amount, short iD, String displayName, List<String> lore) {
        ItemStack itemStack = new ItemStack(type, amount, iD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack createMetaItem(Material type, int amount, short iD, String displayName) {
        ItemStack itemStack = new ItemStack(type, amount, iD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static ItemStack createMetaItem(Material type, int amount, short iD) {
        return new ItemStack(type, amount, iD);
    }



}
