package GUI;
import Cards.*;

public class Controller {
    CardCollection cards;
    
    public void Controller() {
        
    }
    
    public Card[] chooseClass(String chosenClass) {
        
        cards = new CardCollection(chosenClass);
        
        return cards.toArray();
    }
}
