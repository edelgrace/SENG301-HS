import Cards.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchTest {
    
    /* MODEL TESTS */
    
    @Test
    public void Test_NullSearch() {
        // Null earch query
        Search aSearch = new Search();
        String searchQuery = null;
        String[] results = aSearch.query(searchQuery);
        
        // Expected result
        String[] expected = new String[1];
        expected[0] = "No search term was entered. Please try again.";
        
        // Assertion
        assertArrayEquals("Search cannot handle null strings.", expected, results);
    }
    
    @Test
    public void Test_EmptyStringSearch() {
        // Empty search query
        Search aSearch = new Search();
        String searchQuery = "";
        String[] results = aSearch.query(searchQuery);
        
        // Expected results
        String[] expected = new String[1];
        expected[0] = "No search term was entered. Please try again.";
        
        // Assertion
        assertArrayEquals("Search cannot handle empty strings.", expected, results);
    }
    
    @Test
    public void Test_NoResults() {
        // No results
        Search aSearch = new Search();
        String searchQuery = "Example";
        String[] results = aSearch.findCard(searchQuery);
        
        // Expected results
        String[] expected = new String[1];
        expected[0] = "No results.";
        
        // Assertion
        assertArrayEquals("Search cannot handle no results.", expected, results);
    }
    
    @Test
    public void Test_OneResult() {
        // One result
        Search aSearch = new Search();
        String searchQuery = "Swamp";
        String[] results = aSearch.findCard(searchQuery);
        
        // Expected results
        String[] expected = new String[210];
        Card aCard = new Card("Acidic Swamp Ooze", 2, null, 3, 2, null, "EX1_066");
        expected[0] = aCard.getName();
        
        // Assertion
        assertArrayEquals("Search cannot handle one result.", expected, results);
    }
    
    @Test
    public void Test_TwoResults() {
    }
}
