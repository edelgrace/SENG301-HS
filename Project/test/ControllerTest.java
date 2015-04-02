import GUI.*;
import Deck.*;
import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import org.junit.*;

public class ControllerTest {
    private final int deckSize = 30;
    
    /* CHOOSING A CLASS */
    
    @Test
    public void Test_ChooseDruid() {
        // Choose a druid
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Druid");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for druid class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseHunter() {
        // Choose a hunter
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Hunter");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for hunter class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseMage() {
        // Choose a mage
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Mage");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for mage class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChoosePaladin() {
        // Choose a paladin
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Paladin");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for paladin class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChoosePriest() {
        // Choose a priest
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Priest");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for priest class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseShaman() {
        // Choose a shaman
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Shaman");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 84];
        
        // Assertions
        assertEquals("Card collection is not as expected for shaman class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseWarrior() {
        // Choose a warrior
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Warrior");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warrior class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseWarlock() {
        // Choose a warlock
        CardCollection allCards = new CardCollection();
        
        Card[] classCards = Controller.chooseClass("Warlock");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warlock class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_DisplayListNoCards() {
        // Create a list with null values and attempt to display them
        Card[] cards = new Card[deckSize];
        
        for(int i = 0; i < deckSize; i++) {
            cards[i] = null;
        }
        
        Card[] cardDisplay = Controller.displayCards(cards);
        
        // Expected
        String[] expected = new String[30];
        expected[0] = "No cards to be displayed.";
        
        // Assertion
        assertArrayEquals("Cannot properly handle displaying a list of null card.", expected, cardDisplay);
    }
    
    /* NEW DECK */
    @Test
    public void Test_NewDeck() {
        // Create new deck via controller
        String[] aDeck = Controller.newDeck().toArray();
        
        // Expected
        Deck expectedDeck = new Deck();
        String[] expected = expectedDeck.toArray();
        
        // Assertions
        assertArrayEquals("New deck was not intialized properly.", expected, aDeck);
    }
    
    /* MAIN MENU */
    
    @Test
    public void Test_MainMenu() {
        // Call main menu
        JFrame aFrame = Controller.mainMenu();
        
        // Assertion
        assertTrue(aFrame instanceof MainMenu);
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
        Deck aDeck = Controller.add(aButton);
        
        // Expected deck
        int expectedSize = 30;    
        String[] expectedList = new String[30];
        expectedList[0] =  "AB1_234";
        
        // Assertions
        assertArrayEquals("Deck is empty.", expectedList, aDeck.toArray());
        assertEquals("Size of deck does not equal 30.", expectedSize, aDeck.size());
    }
}
