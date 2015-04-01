package Cards;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;

public class CardCollection {
    private Card[] cardList;
    private int cardListSize;
    private int totalClassCard = 97;
    
    public CardCollection() {
        JSONArray list = parseCards();
            
        cardList = new Card[list.size()];
        cardListSize = list.size();
        
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
    
    
    public CardCollection(String chosenClass) {
        JSONArray list = parseCards();
            
        int classCount = 0;
        
        if(chosenClass.equalsIgnoreCase("Shaman")) {
                classCount = 13;        // Number of shaman cards
        }
        else {
                classCount = 12;        // Number of cards per class
        }
        
        cardListSize = list.size() - totalClassCard + classCount;
        
        cardList = new Card[cardListSize];
        int index = 0;
            
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

            if(aCard.getPlayerClass() != null) {
                if(aCard.getPlayerClass().equalsIgnoreCase(chosenClass) || 
                    aCard.getPlayerClass().isEmpty()) {
                    cardList[index] = aCard;
                    index++;
                }
            }
            else { cardList[index] = aCard; }
        }
    }
    
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
    
    public Card get(int i) {
        return cardList[i];
    }
    
    public int getSize() {
        return cardListSize;
    }
    
    public String[] query(String searchTerm) {
        String[] result = new String[1];
                
        if(searchTerm == null || searchTerm.isEmpty()) {
            result[0] = "No search term was entered. Please try again.";
            return result;
        }
        
        result = findCard(searchTerm);
        
        return result;
    }
    
    public String[] findCard(String searchTerm) {
        String[] result = new String[cardListSize];
        int pointer = 0;
        
        /* find card */
        for(int i = 0; i < cardListSize; i++) {
            Card aCard = this.get(i);
            String aCardName = aCard.getName();
            
            if(aCardName.contains(searchTerm)) {
                result[pointer] = aCardName;
                pointer++;
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
