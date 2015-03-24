import Deck.*;
import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;


/* Test structure
 *  @Test
 *  public void TestName(parameters) {
 *      // Act
 *
 *      // Assert
 *      assertEquals(error message, expected value, what the value actually is);
 *  }
 */

public class DeckTest {
    
    /* INITIALIZING DECKS */
    
    @Test
    public void Test_SuccessfulNewDeck() {
        // New instance of deck
        Deck aDeck = new Deck();
        
        // Expected values
        int expectedSize = 30;    
        String[] expectedList = new String[30];
        
        // Assertions
        assertArrayEquals("Deck is not empty.", expectedList, aDeck.toArray());
        assertEquals("Size of deck does not equal 30.", expectedSize, aDeck.size());
    }
    
    // ????
    @Test 
    public void Test_FailNewDeck() {
        // Null deck
        Deck aDeck = null;
        
        assertEquals("Deck was not initialized properly.", false, Deck.isValid(aDeck));
    }
    
    /* ADDING CARD TO DECK */
    
    @Test
    public void Test_AddCardEmpty() {
        // Create a deck
        Deck aDeck = new Deck();
        
        // Add card to deck
        String cardID = "AB1_234";
        aDeck.add(cardID);
        
        // Expected deck
        int expectedSize = 30;    
        String[] expectedList = new String[30];
        expectedList[0] =  "AB1_234";
        
        // Assertions
        assertArrayEquals("Deck is empty.", expectedList, aDeck.toArray());
        assertEquals("Size of deck does not equal 30.", expectedSize, aDeck.size());
    }
    
    @Test
    public void Test_AddCardFullDeck() {
        // 30 cards in a deck
        Deck aDeck = new Deck();
        for(int i = 0; i < 30; i++) {
            aDeck.add(i + "");
        }
        
        String addResult = aDeck.add("One more");
        
        // Expected result
        String expectedString = "Cannot add card to deck. Deck is full.";
        
        // Assertions
        assertEquals("Cannot add to a full deck.", expectedString, addResult);
    }
    
    @Test
    public void Test_AddNoCopies() {
        // Add a card with no copies
        Deck aDeck = new Deck();
        String add = aDeck.add("1");
        
        // Expected
        String expected = null;
        
        // Assertions
        assertEquals("Number of copies are not the same.", expected, add);
    }
    
    @Test
    public void Test_AddOneCopy() {
        // Add a card with one copy
        Deck aDeck = new Deck();
        String add1 = aDeck.add("1");
        String add2 = aDeck.add("1");
        // Expected
        String expectedCopies = null;
        
        // Assertions
        assertEquals("Number of copies are not the same.", expectedCopies, add2);
    }
    
    @Test
    public void Test_AddTwoCopies() {
        // Add a card with two copies
        Deck aDeck = new Deck();
        String add1 = aDeck.add("A");
        String add2 = aDeck.add("A");
        String add3 = aDeck.add("A");
        
        // Expected
        String expectedCopies = "Cannot add more than two copies of a card to a deck.";
        
        // Assertions
        assertEquals("Number of copies are not the same.", expectedCopies, add3);
    }
    
    /* REMOVING CARDS FROM DECK */
    
    @Test
    public void Test_RemoveOneCard() {
        // Remove a card
        Deck aDeck = new Deck();
        aDeck.add("A");
        String removed = aDeck.remove("A");
        
        // Excpected
        String expected = "Removed 1 card(s) with ID A";
        
        assertEquals("Card was not removed.", expected, removed);
    }
    
    /* CONTROLLER TESTS */
    
    /* VIEW TESTS */
}