package Deck;

import Cards.*;

public class Deck {
    private String[] list;              // Array that stores all the cards
    private int next = 0;               // Pointer pointing to next index of array
    private int deckSize = 30;
    private int maxCopies = 2;
    private String playerClass;
    
    // Constructor for a deck, intialize deck array
    public Deck() {
        list = new String[deckSize];
    }
    
    // Add a card to a deck
    public String add(String cardID) {
        // Check if next points to a valid index
        if(next != deckSize) {
            // Check number of copies of cards
            // If not larger than the max copies, don't add card
            if(getCardCopies(cardID) < maxCopies) {
                list[next] = cardID;
                next++;
                return null;
            }
            // If max number of cards exist, don't add
            else {
                return cannotAddTwo();
            }
        }
        // If max number of cards in deck, don't add
        else {
            return cannotAddFull();
        }
    }
    
    // Error message for adding to a full deck
    public String cannotAddFull() {
        return "Cannot add card to deck. Deck is full.";
    }

    // Error message for adding more than two copies of a card to a deck
    public String cannotAddTwo() {
        return "Cannot add more than two copies of a card to a deck.";
    }
    
    // Remove a card
    public String remove(String cardID) {
        int removeCount = 0;
        
        // Remove only one copy of card with specified cardID
        for(int i = 0; i < deckSize; i++) {
            if(list[i] != null) {
                if(list[i].equalsIgnoreCase(cardID)) {
                    list[i] = null;
                    removeCount++;
                    return "Removed " + removeCount + " card(s) with ID " + cardID;
                }
            }
        }
        
        // If not removed, return error
        return cannotRemove();
    }
    
    public String cannotRemove() {
        return "Cannot remove card from deck. Card not found.";
    }
    
    // Get size of deck
    public int size() {
        return list.length;
    }
    
    public String[] toArray() {
        return list;
    }
    
    // Check if deck is valid
    static public boolean isValid(Deck aDeck) {
        if(aDeck == null) {
            return false;
        }
        
        return true;
    }
    
    // Get number of copies of a card in the deck
    public int getCardCopies(String cardID) {
        int numOfCopies = 0;
        
        for(int i = 0; i < deckSize; i++) {
            if(list[i] != null) {
                if(list[i].contains(cardID)) {
                    numOfCopies++;
                }
            }
        }
        
        return numOfCopies;
    }
    
    // Get card at a specified index
    public String get(int i) {
        return list[i];
    }
    
    // Return the next value
    public int getNext() {
        return next;
    }
}
