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
        assertArrayEquals("Save did not work as expected.", expected, save);
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
        assertArrayEquals("Save did not work as expected for two cards.", expected, save);
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
        assertArrayEquals("Save did not work as expected for two cards.", expected, save);
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
        assertArrayEquals("Save did not work as expected for two cards.", expected, save);
    }
    
    /* LOADING */
    
    @Test
    public void Test_HandleFailLoad() {
        
    }
    
    @Test
    public void Test_HandleNullLoad() {
        
    }
    
    @Test
    public void Test_LoadTimestamp() {
        
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
    public void Test_FullDeck() {
        
    }
    
    @Test
    public void Test_29Cards() {
        
    }
    
    @Test
    public void Test_31Cards() {
        
    }
}