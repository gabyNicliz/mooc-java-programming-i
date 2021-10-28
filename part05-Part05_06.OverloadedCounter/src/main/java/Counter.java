/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryzen
 */
public class Counter {
    private int value;
    
    public Counter() {
        this(0);
    }
    
    public Counter(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public void increase() {
        this.value += 1;
    }
    
    public void increase(int value) {
        if (value > 0) {
            this.value += value;
        }
    }
    
    public void decrease() {
        this.value -= 1;
    }
    
    public void decrease(int value) {
        if (value > 0) {
            this.value -= value;
        }
    }
}
