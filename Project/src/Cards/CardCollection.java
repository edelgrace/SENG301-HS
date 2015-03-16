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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.Iterator;

public class CardCollection {
    private Card[] cardList;
    private int cardListSize = 210;
  
    
    public CardCollection() {
        
        try {
            FileReader path = new FileReader("C:\\Users\\Altares\\Desktop\\Copy\\SCHOOL\\[2015 - WINTER]\\SENG 301\\HS\\SENG301-HS\\Project\\src\\Cards\\Basic.enGB.json");
   
            // read the json file
            JSONParser jsonParser = new JSONParser();
            JSONArray list;
            list = (JSONArray) jsonParser.parse(path);
            
            cardList = new Card[list.size()];
            
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
}
