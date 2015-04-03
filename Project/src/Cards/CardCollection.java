package Cards;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;

public class CardCollection {
    private Card[] cardList;
    private int cardListSize;
    private int totalClassCard = 97;
    
    // Initialize card collection for all cards
    public CardCollection() {
        // Parse the json file containiing all the cards
        JSONArray list = parseCards();
            
        // Create an array for all the cards
        cardList = new Card[list.size()];
        cardListSize = list.size();
        
        // Go through parsed array
        for(int i = 0; i < list.size(); i++) {
            JSONObject card = (JSONObject) list.get(i);

            Object name = card.get("name");
            Object cost = card.get("cost");
            Object playerClass = card.get("playerClass");
            Object attack = card.get("attack");
            Object health = card.get("health");
            Object durability = card.get("durability");
            Object id = card.get("id");

            Card aCard = new Card(name, cost, playerClass, attack, health, durability, id);

            cardList[i] = aCard;
        }
    }
    
    // Initialize card collection for a certain class
    public CardCollection(String chosenClass) {
        // Parsae the json file containing all the cards
        JSONArray list = parseCards();
            
        int classCount = 0;
        
        // Check if shaman class was chosen
        if(chosenClass.equalsIgnoreCase("Shaman")) {
                classCount = 13;        // Number of shaman cards
        }
        else {
                classCount = 12;        // Number of cards per class
        }
        
        // Get number of cards in the card collection for specified class
        cardListSize = list.size() - totalClassCard + classCount;
        
        // Create array for all cards
        cardList = new Card[cardListSize];
        int index = 0;
            
        // Go through parsed array and put cards in card list
        for(int i = 0; i < list.size(); i++) {
            JSONObject card = (JSONObject) list.get(i);
            
            Object name = card.get("name");
            Object cost = card.get("cost");
            Object playerClass = card.get("playerClass");
            Object attack = card.get("attack");
            Object health = card.get("health");
            Object durability = card.get("durability");
            Object id = card.get("id");

            Card aCard = new Card(name, cost, playerClass, attack, health, durability, id);
            
            // If card is of chosen class, add to classs
            if(aCard.getPlayerClass() != null) {
                if(aCard.getPlayerClass().equalsIgnoreCase(chosenClass) || 
                    aCard.getPlayerClass().isEmpty()) {
                    cardList[index] = aCard;
                    index++;
                }
            }
            // If card does not have a specified class, add to the deck
            else {
                cardList[index] = aCard;
                index++;
            }
        }
    }
    
    // Parse the cards in the file
    private JSONArray parseCards() {
        try {
            FileReader path = new FileReader("src\\Cards\\Basic.enGB.json");

            // read the json file
            JSONParser jsonParser = new JSONParser();
            JSONArray list;
            list = (JSONArray) jsonParser.parse(path);
            
            path.close();
            
            return list;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    // Get card at a specified index
    public Card get(int i) {
        return cardList[i];
    }
    
    // Get a card using cardID
    public Card get(String ID) {
        Card aCard = new Card();
        
        // Iterate through card list array to match IDs
        for(int i = 0; i < cardListSize; i++) {
            Card card = cardList[i];
            
            if(card != null) {
                String cardID = card.getID();

                if(cardID.equalsIgnoreCase(ID)) {
                    aCard = card;
                    return aCard;
                }
            }
        }
        
        return aCard;
    }
    
    
    // Grab the size of the card array
    public int getSize() {
        return cardListSize;
    }
    
    // Find a card of a search term
    public String[] query(String searchTerm) {
        String[] result = new String[1];
                
        if(searchTerm == null || searchTerm.isEmpty()) {
            result[0] = "No search term was entered. Please try again.";
            return result;
        }
        
        result = findCard(searchTerm);
        
        return result;
    }
    
    // Actually use the search term to find 
    public String[] findCard(String searchTerm) {
        searchTerm = searchTerm.toLowerCase();
        String[] result = new String[cardListSize];
        int pointer = 0;
        
        /* find card */
        for(int i = 0; i < cardListSize; i++) {
            Card aCard = this.get(i);
            
            if(aCard != null) {
                String aCardName = aCard.getName();

                if(aCardName.toLowerCase().contains(searchTerm)) {
                    result[pointer] = aCardName;
                    pointer++;
                }
            }
        }
        
        for(int i = 0; i < cardListSize; i++) {
            if(result[i] != null) {
                return result;
            }
        }
        
        result = new String[1];
        result[0] = "No results.";
        
        return result;
    }
    
    
    public Card[] toArray() {
        return cardList;
    }
}
