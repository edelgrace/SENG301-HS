import Cards.*;
import Deck.*;
import GUI.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControllerTest {
    
    @Test
    public void Test_ChooseDruid() {
        // Choose druid class
        Controller aController = new Controller();
        String result = aController.ChooseClass("Druid");
        
        // Expected
        String expected = "";
        
        // Assertions
        assertEquals("", expected, result);
    }
    
    @Test
    public void Test_ChooseHunter() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChooseMage() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChoosePaladin() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChoosePriest() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChooseShaman() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChooseWarrior() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChooseWarlock() {
        //
        
        // Expected
        
        // Assertions
    }
    
    @Test
    public void Test_ChooseBack() {
        //
        
        // Expected
        
        // Assertions
    }
}
