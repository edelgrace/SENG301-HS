package Cards;


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

    // Constructor for a blank, default card
    public Card() {
        name = null;
        cost = 0;
        playerClass = null;
        attack = 0;
        health = 0;
        durability = 0;
        id = null;
    }
    
    // Constructor for creating a card with attributes
    public Card(Object newName, Object newCost, Object newClass, Object newAttack, Object newHealth, Object newDurability, Object newID)
    {
        // Change name
        if(newName != null) {  name = (String) newName; }
        else { return; }
        
        // Change cost
        if(newCost != null) {
            if(newCost instanceof Long) { cost = (int) (long) newCost; }
            else { cost = (int) newCost; }
        }
        else { cost = 0; }
        
        // Change class
        if(newClass != null) {  playerClass = (String) newClass; }
        
        // Change attack
        if(newAttack != null) {
            if(newAttack instanceof Long) { attack = (int) (long) newAttack; }
            else { attack = (int) newCost; }
        }
        else { attack = 0; }
        
        // Change health
        if(newHealth != null) {
            if(newHealth instanceof Long) { health = (int) (long) newHealth; }
            else { health = (int) newCost; }
        }
        else { health = 0; }
        
        // Change durability
        if(newDurability != null) {
            if(newDurability instanceof Long) { durability = (int) (long) newDurability; }
            else { durability = (int) newCost; }
        }
        else { durability = 0; }
        
        // Change ID
        if(newID != null) {  id = (String) newID; }
    }
    
    /* GETTERS */
    
    // Get name of card
    public String getName() {
        return name;
    }
    
    // Get cost of card
    public int getCost() {
        return cost;
    }
    
    // Get player class
    public String getPlayerClass() {
        return playerClass;
    }
    
    // Get attack
    public int getAttack() {
        return attack;
    }
    
    // Get health
    public int getHealth() {
        return health;
    }
    
    // Get durability
    public int getDurability() {
        return durability;
    }
    
    // Get ID
    public String getID() {
        return id;
    }
    
    /* CONVERSION METHODS */
    
    // Convert card into an array
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
    
    // convert card to a string
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
        
        return string;
    }
}
