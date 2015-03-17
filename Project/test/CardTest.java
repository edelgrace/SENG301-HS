import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    /* MODEL TESTS */
    
    @Test
    public void Test_toString() {
        String name = "A Name";
        Object cost = 1;
        String playerClass = "A class";
        Object attack = 1;
        Object health = 1;
        Object durability = 1;
        String id = "SOME_ID";
        
        // Create a new card
        Card aCard = new Card(name,cost,playerClass,attack,health,durability,id);
                
        // Expected string
        String expectedString = "A Name, 1, A class, 1, 1, 1, SOME_ID";
        
        // Assertions
        assertEquals(expectedString, aCard.toString());
    }
    
    @Test
    public void Test_toStringDefault() {
        // Create a new card using default constructor
        Card aCard = new Card();
       
        // Expected string
        String expectedString = " , 0, , 0, 0, 0, ";
        
        // Assertions
        assertEquals(aCard.toString(), expectedString);
    }
    
    @Test
    public void Test_ToArray() {
        // Create a card using empty constructor
        Card aCard = new Card();
        
        // Expected card
        Object[] expectedCard = new Object[7];
        
        expectedCard[0] = null;
        expectedCard[1] = 0;
        expectedCard[2] = null;
        expectedCard[3] = 0;
        expectedCard[4] = 0;
        expectedCard[5] = 0;
        expectedCard[6] = null;
        
        // Assertion
        assertArrayEquals("toArray did not properly convert card to array", expectedCard, aCard.toArray());
    }
    
    @Test
    public void Test_NewDefaultCard() {
        // Create a card using empty constructor
        Card aCard = new Card();
        
        // Expected card
        Object[] expectedCard = new Object[7];
        
        expectedCard[0] = null;
        expectedCard[1] = 0;
        expectedCard[2] = null;
        expectedCard[3] = 0;
        expectedCard[4] = 0;
        expectedCard[5] = 0;
        expectedCard[6] = null;
        
        // Assertion
        assertArrayEquals("Default constructor does not work as expected", expectedCard, aCard.toArray());
    }
    
    @Test
    public void Test_NewCard() {
        String name = "A Name";
        Object cost = 1;
        String playerClass = "A Class";
        Object attack = 1;
        Object health = 1;
        Object durability = 1;
        String id = "SOME_ID";
        
        // Create a new card
        Card aCard = new Card(name,cost,playerClass,attack,health,durability,id);
                
        // Expected card
        Object[] expectedCard = new Object[7];
        
        expectedCard[0] = name;
        expectedCard[1] = cost;
        expectedCard[2] = playerClass;
        expectedCard[3] = attack;
        expectedCard[4] = health;
        expectedCard[5] = durability;
        expectedCard[6] = id;
        
        // Assertion
        assertArrayEquals("Creating a new instance of cards with specified values did not work as expected", expectedCard, aCard.toArray());
    }
}
