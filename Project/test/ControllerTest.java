import GUI.*;
import Deck.*;
import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControllerTest {
    
    /* CHOOSING A CLASS */
    
    @Test
    public void Test_ChooseDruid() {
        // Choose a druid
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Druid");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for druid class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseHunter() {
        // Choose a hunter
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Hunter");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for hunter class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseMage() {
        // Choose a mage
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Mage");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for mage class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChoosePaladin() {
        // Choose a paladin
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Paladin");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for paladin class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChoosePriest() {
        // Choose a priest
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Priest");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for priest class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseShaman() {
        // Choose a shaman
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Shaman");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 84];
        
        // Assertions
        assertEquals("Card collection is not as expected for shaman class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseWarrior() {
        // Choose a warrior
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Warrior");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warrior class.", expected.length, classCards.length);
    }
    
    @Test
    public void Test_ChooseWarlock() {
        // Choose a warlock
        CardCollection allCards = new CardCollection();
        
        Controller aController = new Controller();
        Card[] classCards = aController.chooseClass("Warlock");
        
        // Expected
        Card[] expected = new Card[allCards.getSize() - 85];
        
        // Assertions
        assertEquals("Card collection is not as expected for warlock class.", expected.length, classCards.length);
    }
    
    
    /* DISPLAYING CARD COLLECTION */
    
    @Test
    public void Test_DisplayNullList() {
        /*// Create a null list to display
        Card[] cardDisplay = null;
        
        
        // Expected
        String expected = "Error displaying cards.";
        
        // Assertion
        assertEquals("", expected,cardDisplay); */
    }
    
    @Test
    public void Test_DisplayListWithNull() {
        
    }
    
    @Test
    public void Test_DisplayNoCards() {
        
    }
    
    @Test
    public void Test_DisplayCard() {
        
    }
    
    @Test
    public void Test_DisplayRow() {
        
    }
    
    @Test
    public void Test_DisplayPage() {
        
    }
    
    @Test
    public void Test_DisplayTwoPages() {
        
    }
    
    @Test
    public void Test_Display1Card() {
        
    }
    
    @Test
    public void Test_DisplayAllCards() {
        
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
}
