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
    
    /* CHOOSING DECK CLASS */
    
    @Test
    public void Test_ChooseDruidClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Druid");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for druid class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChooseHunterClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Hunter");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for hunter class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChooseMageClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Mage");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for mage class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChoosePaladinClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Paladin");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for paladin class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChoosePriestClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Priest");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for priest class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChooseRogueClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Rogue");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for rogue class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChooseShamanClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Shaman");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 84];
        
        // Assertions
        assertEquals("Card collection is not as expected for shaman class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChooseWarriorClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Warrior");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warrior class.", expected.length, classCards.getSize());
    }
    
    @Test
    public void Test_ChooseWarlockClass() {
        // Choose a class
        CardCollection classCards = new CardCollection("Warlock");
        CardCollection allCards = new CardCollection();
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warlock class.", expected.length, classCards.getSize());
    }
    
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
    public void Test_RemoveOneCopy() {
        // Remove a card
        Deck aDeck = new Deck();
        aDeck.add("A");
        String removed = aDeck.remove("A");
        int count = aDeck.getCardCopies("A");
        
        // Excpected
        String expected = "Removed 1 card(s) with ID A";
        int expectedCount = 0;
        
        // Assertion
        assertEquals("Card was not removed properly.", expected, removed);
        assertEquals("Card was not removed properly.", expectedCount, count);
    }
    
    @Test
    public void Test_RemoveOneOfTwo() {
        // Remove a card with two copies
        Deck aDeck = new Deck();
        aDeck.add("A");
        aDeck.add("A");
        String removed = aDeck.remove("A");
        int copyCount = aDeck.getCardCopies("A");
        
        // Expected
        String expectedString = "Removed 1 card(s) with ID A";
        int expectedCopyCount = 1;
        
        // Assertion
        assertEquals("Cards were not removed properly.", expectedString, removed);
        assertEquals("Cards were not removed properly.", expectedCopyCount, copyCount);
    }
    
    @Test
    public void Test_RemoveNonExistingCard() {
        // Remove a card with no copies in deck
        Deck aDeck = new Deck();
        String removed = aDeck.remove("A");
        
        // Expected
        String expected = "Cannot remove card from deck. Card not found.";
        
        // Assertion
        assertEquals("Non existant card removal not working properly.", expected, removed);
    }
    
    /* GETTING CARDS */
    
    @Test
    public void Test_GetACardFromEmpty() {
        // Get a card from an empty deck
        Deck aDeck = new Deck();
        String card = aDeck.get(0);
        
        // Expected
        String expected = null;
        
        // Assertion
        assertEquals("Retreiving a card by index from empty deck did not work as expected.", expected, card);
    }
    
    @Test
    public void Test_GetACardWithIndexOutOfBounds() {
        // Get a card from an empty deck
        Deck aDeck = new Deck();
        aDeck.add("A");
        aDeck.add("B");
        aDeck.add("C");
        
        String card = aDeck.get(5);
        
        // Expected
        String expected = null;
        
        // Assertion
        assertEquals("Retreiving a card by index from empty deck did not work as expected.", expected, card);
    }
    
    @Test
    public void Test_GetACardWithIndex() {
        // Get a card from an empty deck
        Deck aDeck = new Deck();
        aDeck.add("E");
        aDeck.add("D");
        aDeck.add("C");
        aDeck.add("B");
        aDeck.add("A");
        
        String card = aDeck.get(3);
        
        // Expected
        String expected = "B";
        
        // Assertion
        assertEquals("Retreiving a card by index from empty deck did not work as expected.", expected, card);
    }
    
    /* CONTROLLER TESTS */
    
    /* VIEW TESTS */
}