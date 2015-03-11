/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Deck.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Altares
 */

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
    
    @Test
    public void Test_NewDeck () {
        // New instance of deck
        Deck aDeck = new Deck();
        
        // Expected values
        int expectedSize = 30;       
        
        // Assertions
        assertEquals("Size of deck does not equal 30.", expectedSize, aDeck.size());
    }
}
