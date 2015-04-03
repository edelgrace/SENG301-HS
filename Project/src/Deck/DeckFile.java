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
        // If a deck is null, return
        if(someDeck == null ) {
            return null;
        }
        
        // If deck is not null
        String[] savedDeck = new String[deckSize];
        String[] aDeck = someDeck.toArray();
        
        FileWriter aWriter;
        PrintWriter pw;
        FileReader aReader;
        BufferedReader aBuffer;
                
        String path ="src\\";

        // Get time stamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String time = new SimpleDateFormat("MM-dd-yyyy-hh-mm").format(timestamp);

        // File name is time stamp
        path += time + "s.txt";

        try {
            // Write deck to a file, line by line
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
    
    // Load a card
    public Deck load(String filename) {
        Deck aDeck = new Deck();
        
        // Check if filename is null and don't proceed if null
        if(filename == null) {
            aDeck.add("There was an error with this save file.");
            return aDeck;
        }
        
        FileReader aReader;
        BufferedReader aBuffer;
        
        String path = "src\\" + filename;
        
        // Read save file line by line
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
            aDeck.add("The save file was not found.");
            System.out.println(aDeck.get(0));
            return aDeck;
        }
        catch (Exception e) {
            aDeck.add("Something went wrong with loading this deck.");
            System.out.println(aDeck.get(0));
            return aDeck;
        }
    }
}
