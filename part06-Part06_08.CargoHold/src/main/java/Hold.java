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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase s) {
        if (!(this.totalWeight() + s.totalWeight() > this.maxWeight)) {
            this.suitcases.add(s);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Suitcase s : this.suitcases) {
            s.printItems();
        }
    }
    
    @Override
    public String toString() {
        if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
