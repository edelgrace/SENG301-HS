package Cards;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.Iterator;

public class CardCollection {
    private Card[] cardList;
    private int cardListSize;
  
    
    public CardCollection() {
        try {
            FileReader path = new FileReader("C:\\Users\\Altares\\Desktop\\Copy\\SCHOOL\\[2015 - WINTER]\\SENG 301\\HS\\SENG301-HS\\Project\\src\\Cards\\Basic.enGB.json");
   
            // read the json file
            JSONParser jsonParser = new JSONParser();
            JSONArray list;
            list = (JSONArray) jsonParser.parse(path);
            
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
        catch (Exception e){
            e.printStackTrace();
        }
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
}
