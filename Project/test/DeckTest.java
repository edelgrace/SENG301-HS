import Deck.*;
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
    
    /* MODEL TESTS */
    @Test
    public void Test_SuccessfulNewDeck () {
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
    
    @Test
    public void Test_AddCardEmpty () {
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
    
    /* CONTROLLER TESTS */
    
    /* VIEW TESTS */
}