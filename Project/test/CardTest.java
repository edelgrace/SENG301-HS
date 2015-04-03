import Cards.*;
import GUI.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    @Test
    public void Test_toStringNull() {
        // A card
        Card newCard = new Card(null,0,null,0,0,0,null);
        String aCard = newCard.toString();
        
        // Expected
        String expected = " , 0, , 0, 0, 0, ";
        
        // Assertion
        assertEquals("Null card initialization did not work as expected.", expected, aCard);
    }
    
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
    
    @Test
    public void Test_GetName () {
        // Get name of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        String name = aCard.getName();
        
        // Expected result
        String expected = "name";
        
        // Assertions
        assertEquals("Name is not the same.", expected, name);
    }
    
    @Test
    public void Test_GetCost () {
        // Get cost of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        int cost = aCard.getCost();
        
        // Expected result
        int expected = 1;
        
        // Assertions
        assertEquals("Cost is not the same.", expected, cost);
    }
    
    @Test
    public void Test_GetPlayerClass () {
        // Get class of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        String playerClass = aCard.getPlayerClass();
        
        // Expected result
        String expected = "class";
        
        // Assertions
        assertEquals("Class is not the same.", expected, playerClass);
    }
    
    @Test
    public void Test_GetAttack () {
        // Get attack of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        int attack = aCard.getAttack();
        
        // Expected result
        int expected = 1;
        
        // Assertions
        assertEquals("Attack is not the same.", expected, attack);
    }
    
    @Test
    public void Test_GetHealth () {
        // Get health of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        int health = aCard.getHealth();
        
        // Expected result
        int expected = 1;
        
        // Assertions
        assertEquals("Health is not the same.", expected, health);
    }
    
    @Test
    public void Test_GetDurability () {
        // Get durability of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        int durability = aCard.getDurability();
        
        // Expected result
        int expected = 1;
        
        // Assertions
        assertEquals("Durability is not the same.", expected, durability);
    }
    
    @Test
    public void Test_getID() {
        // Get ID of card
        Card aCard = new Card("name", 1, "class", 1, 1, 1, "ID");
        String id = aCard.getID();
        
        // Expected result
        String expected = "ID";
        
        // Assertions
        assertEquals("ID is not the same.", expected, id);
    }
    
    /* SEARCHING CARD COLLECTION */
    
    @Test
    public void Test_NullSearch() {
        // Null earch query
        CardCollection cards = new CardCollection();
        String searchQuery = null;
        String[] results = cards.query(searchQuery);
        
        // Expected result
        String[] expected = new String[1];
        expected[0] = "No search term was entered. Please try again.";
        
        // Assertion
        assertArrayEquals("Search cannot handle null strings.", expected, results);
    }
    
    @Test
    public void Test_EmptyStringSearch() {
        // Empty search query
        CardCollection cards = new CardCollection();
        String searchQuery = "";
        String[] results = cards.query(searchQuery);
        
        // Expected results
        String[] expected = new String[1];
        expected[0] = "No search term was entered. Please try again.";
        
        // Assertion
        assertArrayEquals("Search cannot handle empty strings.", expected, results);
    }
    
    @Test
    public void Test_NoResults() {
        // No results
        CardCollection cards = new CardCollection();
        String searchQuery = "Example";
        String[] results = cards.findCard(searchQuery);
        
        // Expected results
        String[] expected = new String[1];
        expected[0] = "No results.";
        
        // Assertion
        assertArrayEquals("Search cannot handle no results.", expected, results);
    }
    
    @Test
    public void Test_OneResult() {
        // One result
        CardCollection cards = new CardCollection();
        String searchQuery = "Swamp";
        String[] results = cards.findCard(searchQuery);
        
        // Expected results
        String[] expected = new String[cards.getSize()];
        Card aCard = new Card("Acidic Swamp Ooze", 2, null, 3, 2, null, "EX1_066");
        expected[0] = aCard.getID();
        
        // Assertion
        assertArrayEquals("Search cannot handle one result.", expected, results);
    }
    
    @Test
    public void Test_TwoResults() {
        // One result
        CardCollection cards = new CardCollection();
        String searchQuery = "life";
        String[] results = cards.findCard(searchQuery);
        
        // Expected results
        String[] expected = new String[cards.getSize()];
        Card aCard1 = new Card("Life Tap", 2, null, null, null, null, "CS2_056");
        Card aCard2 = new Card("Drain Life", 3, null, null, null, null, "CS2_061");
        expected[0] = aCard2.getID();
        expected[1] = aCard1.getID();
        
        // Assertion
        assertArrayEquals("Search cannot handle one result.", expected, results);
    }
}
