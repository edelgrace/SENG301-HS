import Deck.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SaveLoadTest {
    private int deckSize = 30;
    
    /* SAVING */
    
    @Test
    public void Test_BadSave() {
        // Botched save
        Deck aDeck = null;
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = null;
        
        // Assertion
        assertArrayEquals("Saving a null deck did not go as expected.", expected, save);
    }
    
    @Test
    public void Test_SaveEmptyDeck() {
        // Save an empty deck
        Deck aDeck = new Deck();
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = new String[deckSize];
        
        // Assertion
        assertArrayEquals("Save did not work as expected for an empty deck.", expected, save);
    }
    
    @Test
    public void Test_SaveOneCard() {
        // Save a deck with one card in it
        Deck aDeck = new Deck();
        aDeck.add("A");
        
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = new String[deckSize];
        expected[0] = "A";
        
        // Assertion
        assertArrayEquals("Save did not work as expected for one card.", expected, save);
    }
    
    @Test
    public void Test_SaveTwoCards() {
        // Save a deck with one card in it
        Deck aDeck = new Deck();
        aDeck.add("A");
        aDeck.add("B");
        
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = new String[deckSize];
        expected[0] = "A";
        expected[1] = "B";
        
        // Assertion
        assertArrayEquals("Save did not work as expected for two cards.", expected, save);
    }
    
    @Test
    public void Test_SaveFullDeck() {
        // Save a deck with one card in it
        Deck aDeck = new Deck();
        for(int i = 0; i < deckSize; i++) {
            aDeck.add(i + "");
        }
        
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = new String[deckSize];
        for(int i = 0; i < deckSize; i++) {
            expected[i] = i + "";
        }
        
        // Assertion
        assertArrayEquals("Save did not work as expected for full deck.", expected, save);
    }
    
    @Test
    public void Test_Save31Cards() {
        // Save a full deck with one extra card in it
        Deck aDeck = new Deck();
        for(int i = 0; i < deckSize + 1; i++) {
            aDeck.add(i + "");
        }
        
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = new String[deckSize];
        for(int i = 0; i < deckSize; i++) {
            expected[i] = i + "";
        }
        
        // Assertion
        assertArrayEquals("Save did not work as expected for 31 cards.", expected, save);
    }
    
    @Test
    public void Test_Save29Cards() {
        // Save a deck with a full deck minus 1 cards in it
        Deck aDeck = new Deck();
        for(int i = 0; i < deckSize - 1; i++) {
            aDeck.add(i + "");
        }
        
        DeckFile deckFile = new DeckFile();
        String[] save = deckFile.save(aDeck);
        
        // Expected
        String[] expected = new String[deckSize];
        for(int i = 0; i < deckSize - 1; i++) {
            expected[i] = i + "";
        }
        
        // Assertion
        assertArrayEquals("Save did not work as expected for 29 cards.", expected, save);
    }
    
    /* LOADING */
    
    @Test
    public void Test_HandleNonExistentSave() {
        // Fail load
        DeckFile aDeckFile = new DeckFile();
        String filename = "non-existent.txt";
        String[] loaded = aDeckFile.load(filename).toArray();
        
        // Expected
        String[] expected = new String[30];
        expected[0] = "The save file was not found.";
        
        // Assertion
        assertArrayEquals("Loading a non existent save is not handled correctly.", expected, loaded);
    }
    
    @Test
    public void Test_HandleNullLoad() {
        // Fail load
        DeckFile aDeckFile = new DeckFile();
        String filename = null;
        String[] loaded = aDeckFile.load(filename).toArray();
        
        // Expected
        String[] expected = new String[30];
        expected[0] = "There was an error with this save file.";
        
        // Assertion
        assertArrayEquals("Loading a null save is not handled correctly.", expected, loaded);
    }
    
    @Test
    public void Test_LoadEmptyDeck() {
        
    }
    
    @Test
    public void Test_LoadOneCard() {
        
    }
    
    @Test
    public void Test_LoadTwoCards() {
        
    }
    
    @Test
    public void Test_LoadFullDeck() {
        
    }
    
    @Test
    public void Test_Load29Cards() {
        
    }
    
    @Test
    public void Test_Load31Cards() {
        
    }
}