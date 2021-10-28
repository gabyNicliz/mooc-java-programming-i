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

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person p) {
        this.persons.add(p);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) return null;
        
        Person shortestPerson = this.persons.get(0);
        
        for (int i = 1; i < this.persons.size(); i++) {
            if (shortestPerson.getHeight() > this.persons.get(i).getHeight()) {
                shortestPerson = this.persons.get(i);
            }
        }
        
        return shortestPerson;
    }
    
    public Person take() {
        if (this.persons.isEmpty()) return null;
        
        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        
        return shortestPerson;
    }
}
