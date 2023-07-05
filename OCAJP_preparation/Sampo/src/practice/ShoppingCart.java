package practice;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayItems() {
        System.out.println("Shopping Cart:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Shirt");
        cart.addItem("Shoes");
        cart.addItem("Hat");
        cart.removeItem("Shoes");
        cart.displayItems();
    }
}
