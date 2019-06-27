package com.algomi.interview;

import com.algomi.interview.domain.Item;

public class Catalogue
{
    public static final Item AVENGERS_ASSEMBLE = new Item("Avengers Assemble", Item.ItemType.DVD, 9.99f);
    public static final Item BOND_COLLECTION = new Item("The Bond Collection", Item.ItemType.DVD, 14.95f);
    public static final Item BLUE_PLANET = new Item("The Blue Planet", Item.ItemType.DVD, 20.0f);

    public static final Item APPLE = new Item("Fresh Apple", Item.ItemType.Food, 0.2f);
    public static final Item MILK = new Item("Milk", Item.ItemType.Food, 0.5f);

    public static final Item SHIRT = new Item("Shirt", Item.ItemType.Clothing, 5.95f);
    public static final Item TROUSERS = new Item("Trousers", Item.ItemType.Clothing, 24.5f);
}
