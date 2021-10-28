/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryzen
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxTotalWeight;

    public Suitcase(int maxTotalWeight) {
        this.items = new ArrayList<>();
        this.maxTotalWeight = maxTotalWeight;
    }

    public void addItem(Item item) {
        if (!(this.totalWeight() + item.getWeight() > this.maxTotalWeight)) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        if (this.items.isEmpty()) {
            return 0;
        }

        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) return null;
        
        Item heaviestItem = this.items.get(0);
        
        for (int i = 1; i < this.items.size(); i++) {
            if (heaviestItem.getWeight() < this.items.get(i).getWeight()) {
                heaviestItem = this.items.get(i);
            }
        }
        
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
