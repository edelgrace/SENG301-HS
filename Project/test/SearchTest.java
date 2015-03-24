import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchTest {
    
    /* MODEL TESTS */
    
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
        expected[0] = aCard.getName();
        
        // Assertion
        assertArrayEquals("Search cannot handle one result.", expected, results);
    }
    
    @Test
    public void Test_TwoResults() {
        // One result
        CardCollection cards = new CardCollection();
        String searchQuery = "Wolf";
        String[] results = cards.findCard(searchQuery);
        
        // Expected results
        String[] expected = new String[cards.getSize()];
        Card aCard1 = new Card("Wolfrider", 3, null, 3, 1, null, "CS2_124");
        Card aCard2 = new Card("Timber Wolf", 1, null, 1, 1, null, "DS1_175");
        expected[0] = aCard2.getName();
        expected[1] = aCard1.getName();
        
        // Assertion
        assertArrayEquals("Search cannot handle one result.", expected, results);
    }
}
