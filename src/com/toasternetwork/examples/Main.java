package com.toasternetwork.examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Apple", "Cosmic Crisp", 150, 1.99));
        items.add(new Item("Peach", "Georgia Peach", 150, 2.20));
        items.add(new Item("Honey", "Locally sourced Honey", 75, 5.99));
        items.add(new Item("Dr. Pepper", "Soft Drink", 500, 2.25));
        items.add(new Item("Apple Juice", "Cold-pressed Juice", 150, 4.99));
        items.add(new Item("Banana", "Banana", 150, 1.50));

        LinkedList<Item> linkedItems = new LinkedList<>(items);
        Item manipulated = null;
        try {
            manipulated = (Item) items.get(items.size() - 1).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return;
        }
        manipulated.setName("The Specialnana");
        manipulated.setDescription("Special Nana");
        manipulated.setPrice(5.00);
        manipulated.setQuantity(5);
        linkedItems.addFirst(manipulated);
        items.forEach(System.out::println);
        System.out.println("----------------------------------------");
        linkedItems.forEach(System.out::println);

    }
}
