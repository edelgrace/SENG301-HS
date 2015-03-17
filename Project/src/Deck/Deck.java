package Deck;

public class Deck {
    private String[] list;              // Array that stores all the cards
    private int next = 0;               // Pointer pointing to next index of array
    
    public Deck() {
        list = new String[30];
    }
    
    public void add(String cardID) {
        list[next] = cardID;
        next++;
    }
    
    public int size() {
        return list.length;
    }
    
    public String[] toArray() {
        return list;
    }
    
    static public boolean isValid(Deck aDeck) {
        if(aDeck == null) {
            return false;
        }
        
        return true;
    }
}
