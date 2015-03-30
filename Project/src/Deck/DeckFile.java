package Deck;

import java.io.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

public class DeckFile {
    int deckSize = 30;
    
    public void DeckFile() {
    }
    
    /* SAVING A DECK */
    
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
    
    public Deck load(String filename) {
        Deck aDeck = new Deck();
        
        if(filename == null) {
            aDeck.add("There was an error with this save file.");
            return aDeck;
        }
        
        FileReader aReader;
        BufferedReader aBuffer;
        
        String path = "src\\" + filename;
        
        try {
            aReader = new FileReader(path);
            aBuffer = new BufferedReader(aReader);
            
            while(aBuffer.readLine() != null) {
                aDeck.add(aBuffer.readLine());
            }
            
            aReader.close();
            
            return aDeck;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            aDeck.add("The save file was not found.");
            return aDeck;
        }
        catch (Exception e) {
            e.printStackTrace();
            aDeck.add("Something went wrong with loading this deck.");
            return aDeck;
        }
    }
}
