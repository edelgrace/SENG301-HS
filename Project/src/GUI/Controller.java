package GUI;
import Cards.*;
import javax.swing.*;

public class Controller {
    CardCollection cards;
    
    public void Controller() {
        
    }
    
    public Card[] chooseClass(String chosenClass) {
        
        cards = new CardCollection(chosenClass);
        
        return cards.toArray();
    }
}
