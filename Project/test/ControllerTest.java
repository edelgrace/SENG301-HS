import GUI.*;
import Deck.*;
import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import org.junit.*;

public class ControllerTest {
    private final int deckSize = 30;
    
    /* MAIN MENU */
    
    @Test
    public void Test_MainMenu() {
        // Call main menu
        JFrame aFrame = Main.mainMenu();
        
        // Assertion
        assertTrue(aFrame instanceof MainMenu);
    }
    
    /* NEW DECK */
    
    @Test
    public void Test_NewDeck() {
        // Create new deck via controller
        String[] aDeck = Main.newDeck().toArray();
        
        // Expected
        Deck expectedDeck = new Deck();
        String[] expected = expectedDeck.toArray();
        
        // Assertions
        assertArrayEquals("New deck was not intialized properly.", expected, aDeck);
    }
    
    /* CHOOSING A CLASS */
    
    @Test
    public void Test_ChooseDruid() {
        // Choose a druid
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Druid");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for druid class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseHunter() {
        // Choose a hunter
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Hunter");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for hunter class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseMage() {
        // Choose a mage
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Mage");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for mage class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChoosePaladin() {
        // Choose a paladin
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Paladin");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for paladin class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChoosePriest() {
        // Choose a priest
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Priest");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for priest class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseShaman() {
        // Choose a shaman
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Shaman");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 84];
        
        // Assertions
        assertEquals("Card collection is not as expected for shaman class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseWarrior() {
        // Choose a warrior
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Warrior");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warrior class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseWarlock() {
        // Choose a warlock
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Main.chooseClass("Warlock");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warlock class.", expected.length, classCards.length);
    }
    
    /* DISPLAYING */
    
    @Test
    public void Test_DisplayNullList() {
        // Create a null list
        String[] cards = null;
        
        String[] cardDisplay = Main.displayCards(cards);
        
        // Expected
        String[] expected = new String[1];
        expected[0] = "No cards to be displayed.";
        
        // Assertion
        assertArrayEquals("Cannot properly handle displaying a list of null card.", expected, cardDisplay);
    }
    
    @Test
    public void Test_DisplayNullListCards() {
        // Create a null list
        Card[] cards = null;
        
        Card[] cardDisplay = Main.displayCards(cards);
        
        // Expected
        Card[] expected = null;
        
        // Assertion
        assertArrayEquals("Cannot properly handle displaying a list of null card.", expected, cardDisplay);
    }
    
    @Test
    public void Test_DisplayCard() {
        // Create a null list
        Card[] cards = new Card[1];
        Card aCard = new Card();
        cards[0] = aCard;
        
        Card[] cardDisplay = Main.displayCards(cards);
        
        // Expected
        Card[] expected = cards;
        
        // Assertion
        assertArrayEquals("Cannot properly handle displaying a list of one card.", expected, cardDisplay);
    }
    
    /* DISPLAY DECK */
    
    @Test
    public void Test_DisplayEmptyDeck() {
        
    }
    
    @Test
    public void Test_DisplayNullDeck() {
        
    }
    
    @Test
    public void Test_Display1CardDeck() {
        
    }
    
    @Test
    public void Test_Display2CardDeck() {
        
    }
    
    @Test
    public void Test_Display29CardDeck() {
        
    }
    
    @Test
    public void Test_Display30CardDeck() {
        
    }
    
    @Test
    public void Test_Display31CardDeck() {
        
    }
    
    /* ADDING CARD TO DECK */
    
    @Test
    public void Test_AddCard() {
        // Add card via controller
        JButton aButton = new JButton();
        String cardID = "AB1_234";
        aButton.setName(cardID);
        Deck aDeck = Main.add(aButton);
        
        // Expected deck
        int expectedSize = 30;    
        String[] expectedList = new String[30];
        expectedList[0] =  "AB1_234";
        
        // Assertions
        assertArrayEquals("Deck is empty.", expectedList, aDeck.toArray());
        assertEquals("Size of deck does not equal 30.", expectedSize, aDeck.size());
    }
    
    /* SEARCH */
    
    @Test public void Test_ControllerSearch() {
        // Controller search
        CardCollection cards = new CardCollection();
        JTextField field = new JTextField("Swamp");
        String[] results = Main.search(field);
        
        // Expected
        String[] expected = new String[67];
        Card aCard = new Card("Acidic Swamp Ooze", 2, null, 3, 2, null, "EX1_066");
        expected[0] = aCard.getID();
        
        // Assert
        assertArrayEquals("Search through controller does not work as expected.", expected, results);
    }
    
    @Test
    public void Test_LoadDeckScreen() {
        // Get load deck screen
        JFrame aFrame = Main.loadDeck();
        
        // Assert
        assertTrue(aFrame instanceof LoadDeck);
    }
    
    @Test
    public void Test_SaveDeckScreen() {
        // Get load deck screen
        JFrame aFrame = Main.saveDeck();
        
        // Assert
        assertTrue(aFrame instanceof SaveDeck);
    }
}
