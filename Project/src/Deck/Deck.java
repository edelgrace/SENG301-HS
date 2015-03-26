package Deck;

import Cards.*;

public class Deck {
    private String[] list;              // Array that stores all the cards
    private int next = 0;               // Pointer pointing to next index of array
    private int deckSize = 30;
    private int maxCopies = 2;
    private String playerClass;
    
    public Deck() {
        list = new String[deckSize];
    }
    
    public String add(String cardID) {
        if(next != deckSize) {
            if(getCardCopies(cardID) < maxCopies) {
                list[next] = cardID;
                next++;
                return null;
            }
            else {
                return cannotAddTwo();
            }
        }
        else {
            return cannotAddFull();
        }
    }
    
    public String cannotAddFull() {
        return "Cannot add card to deck. Deck is full.";
    }

    public String cannotAddTwo() {
        return "Cannot add more than two copies of a card to a deck.";
    }
    
    public String remove(String cardID) {
        int removeCount = 0;
        
        for(int i = 0; i < deckSize; i++) {
            if(list[i] != null) {
                if(list[i].equals(cardID)) {
                    list[i] = null;
                    removeCount++;
                    return "Removed " + removeCount + " card(s) with ID " + cardID;
                }
            }
        }
        
        return cannotRemove();
    }
    
    public String cannotRemove() {
        return "Cannot remove card from deck. Card not found.";
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
    
    public String get(int i) {
        return list[i];
    }
}
