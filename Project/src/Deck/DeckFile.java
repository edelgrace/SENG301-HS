package Deck;

import java.io.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

public class DeckFile {
    int deckSize = 30;
    
    public void DeckFile() {
    }
    
    public String[] save(Deck someDeck) {
        if(someDeck == null ) {
            return null;
        }
        
        String[] savedDeck = new String[deckSize];
        String[] aDeck = someDeck.toArray();
        
        FileWriter aWriter;
        PrintWriter pw;
        FileReader aReader;
        BufferedReader aBuffer;
                
        String path ="src\\";

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String time = new SimpleDateFormat("MM-dd-yyyy-hh-mm").format(timestamp);

        path += time + "s.txt";

        try {
            aWriter = new FileWriter(path);
            pw = new PrintWriter(aWriter);
            
            for(int i = 0; i < deckSize; i++) {
                
                pw.println(aDeck[i]);
                
                savedDeck[i] = aDeck[i];
            }
            
            aWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            return savedDeck;
        }
        
        return savedDeck;
    }
}
