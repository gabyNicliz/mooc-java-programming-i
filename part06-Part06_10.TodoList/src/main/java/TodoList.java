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

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        int index = 1;
        
        for (String task : this.todoList) {
            System.out.println(index + ": " + task);
            index++;
        }
    }
    
    public void remove(int index) {
        if (!this.todoList.isEmpty()) {
            this.todoList.remove(index - 1);
        }
    }
}
