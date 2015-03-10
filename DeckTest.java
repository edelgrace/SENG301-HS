package Deck;

import static org.junit.Assert.*;

import org.junit.Test;

/* Test structure
 *  @Test
 *  public void TestName(parameters) {
 *      // Act
 *
 *      // Assert
 *      assertEquals(error message, expected value, what the value actually is);
 *  }
 * /
 
public class DeckTest {
    
    @Test
    public void Test_NewDeckSize () {
        // New instance of deck
        Deck aDeck = new Deck();
        
        // Expected values
        int expectedSize = 30;       
        
        /* Assertions */
        
        // Checks if size of deck is right
		assertEquals("Size of deck does not equal 30.", expectedsize, aDeck.size());
    }

    @Test
    public void Test_NewDeckNull () {
        // New instance of deck
        Deck aDeck = new Deck();
        
        /* Assertions */
        
        // Checks if deck is null
		assertNotNull("A new initialized deck is null.", aDeck);
    }
}
