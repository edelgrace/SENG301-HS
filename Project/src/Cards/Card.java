/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

/**
 *
 * @author Altares
 */

public class Card {
    
    /* CARD ATTRIBUTES */
    private String name;
    private int cost;
    private String playerClass;
    private int attack;
    private int health;
    private int durability;
    private String id;
    
    /* CONSTRUCTORS */
    
    public Card() {
        name = null;
        cost = 0;
        playerClass = null;
        attack = 0;
        name = null;
        health = 0;
        durability = 0;
        id = null;
    }
    
    /**
     *
     * @param newName
     * @param newCost
     * @param newClass
     * @param newAttack
     * @param newHealth
     * @param newDurability
     * @param newID
     */
    public Card(Object newName, Object newCost, Object newClass, Object newAttack, Object newHealth, Object newDurability, Object newID)
    {
        if(newName != null) {  name = (String) newName; }
        
        if(newCost != null) {
            if(newCost instanceof Long) { cost = (int) (long) newCost; }
            else { cost = (int) newCost; }
        }
        
        if(newClass != null) {  playerClass = (String) newClass; }
        
        if(newAttack != null) {
            if(newAttack instanceof Long) { attack = (int) (long) newAttack; }
            else { cost = (int) newCost; }
        }
        
        if(newHealth != null) {
            if(newHealth instanceof Long) { health = (int) (long) newHealth; }
            else { cost = (int) newCost; }
        }
        
        if(newDurability != null) {
            if(newDurability instanceof Long) { durability = (int) (long) newDurability; }
            else { cost = (int) newCost; }
        }
        
        if(newID != null) {  id = (String) newID; }
    }
    
    /* GETTERS */
    
    public String getName() {
        return name;
    }
    
    public int getCost() {
        return cost;
    }
    
    public String getPlayerClass() {
        return playerClass;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getDurability() {
        return durability;
    }
    
    public String getID() {
        return id;
    }
    
    /* SETTERS */
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setCost(int newCost) {
        cost = newCost;
    }
    
    public void setPlayerClass(String newClass) {
        playerClass = newClass;
    }
    
    public void setAttack(int newAttack) {
        attack = newAttack;
    }
    
    public void setHealth(int newHealth) {
        health = newHealth;
    }
    
    public void setDurability(int newDurability) {
        durability = newDurability;
    }
    
    public void setID(String newID) {
        id = newID;
    }
    
    /* CONVERSION METHODS */
    
    public Object[] toArray() {
        Object[] array = new Object[7];
        
        array[0] = name;
        array[1] = cost;
        array[2] = playerClass;
        array[3] = attack;
        array[4] = health;
        array[5] = durability;
        array[6] = id;
        
        return array;
    }
    
    public String toString() {
        String string = "";
        
        if(name != null) { string += name + ", "; }
        else { string += " , "; }
        
        string += cost + ", ";
        
        if(playerClass != null) { string += playerClass + ", "; }
        else { string += ", "; }
        
        string += attack + ", ";
        string += health + ", ";
        string += durability + ", ";
        
        if(id != null) { string += id; }
        
        if(this == null) { return "Card is null and cannot be converted to string."; }
        return string;
    }
}
