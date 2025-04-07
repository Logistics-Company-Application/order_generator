package com.logistics.order_generator;

import java.util.Arrays;
import java.util.List;

public class FakeNames {
    private static List<String> NAMES = Arrays.asList("Alice", "Bob", "Charlie", "Duncan", "Elisabeth", "Finland", "Garret", "Heith", "Innis", "Jacob");
    private static List<String> PRODUCTNAMES = Arrays.asList("Sink", "Toy", "Top", "iPad", "Phone", "Bottle", "Hoodie", "Shirt", "Jeans", "Mouse");
    private static List<String> DESCRIPTIONS = Arrays.asList("Hard top", "fun object", "spinning fun", "electronic entertainment", "calling method", "drinking utensil", "warm apparel", "Chest protector", "classic pants", "computer navigator");
    private static List<String> DESTINATIONS = Arrays.asList("Atlanta", "Baltimore", "Charleston", "Dayton", "Europe", "Finland", "Georgia", "Houston", "Indianapolis", "Jackson");

    public String getName(int index){
        return NAMES.get(index);
    }
    public String getProductName(int index){
        return PRODUCTNAMES.get(index);
    }
    public String getDescription(int index){
        return DESCRIPTIONS.get(index);
    }
    public String getDestination(int index){
        return DESTINATIONS.get(index);
    }
}
