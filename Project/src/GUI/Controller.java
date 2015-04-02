package GUI;
import Cards.*;
import Deck.*;
import java.awt.*;
import java.awt.Frame;
import javax.swing.*;

public class Controller {
    
    private static CardCollection cards = new CardCollection();
    private static MainMenu main = new MainMenu();
    private static ChooseClass chooseClass;
    private static String deckClass;
    private static LoadDeck loadDeck;
    private static SaveDeck saveDeck;
    private static DeckScreen deckScreen = new DeckScreen("");
    private static Deck deck = new Deck();
    
    private static JFrame[] windowStack = new JFrame[10];
    private static int stackPointer = 0;
    
    public static void main(String[] args) {
        main.setVisible(true);
        
        windowStack[stackPointer] = main;
        stackPointer++;
    }
    
    public static Deck newDeck() {
        chooseClass = new ChooseClass();
        chooseClass.setVisible(true);
        
        JFrame previousFrame = windowStack[stackPointer-1];
        
        windowStack[stackPointer] = chooseClass;
        
        previousFrame.setVisible(false);
        
        return deck;
    }
    
    public static String[] search(JTextField search) {
        String keyword = search.getText();
        
        cards = new CardCollection(deckClass);
        
        String[] results = cards.query(keyword);
        
        displayCards(results);
        
        return results;
    }
    
    public static JFrame mainMenu() {
        JFrame previousFrame = windowStack[stackPointer-1];
        
        previousFrame.setVisible(false);
        
        main.setVisible(true);
        
        windowStack[stackPointer-1] = main;
        
        stackPointer -= 1;
        
        return windowStack[stackPointer];
    }
        
    public static JFrame[] loadDeck() {
        loadDeck = new LoadDeck();
        loadDeck.setVisible(true);
        
        windowStack[stackPointer] = loadDeck;
        JFrame previousFrame = windowStack[stackPointer-1];
        
        previousFrame.setVisible(false);
        
        return windowStack;
    }
    
    public static JFrame[] saveDeck() {
        saveDeck = new SaveDeck();
        saveDeck.setVisible(true);
        
        windowStack[stackPointer] = saveDeck;
        JFrame previousFrame = windowStack[stackPointer-1];
        
        previousFrame.setVisible(false);
        
        return windowStack;
    }
    
    public static JFrame[] back() {
        JFrame previousFrame = windowStack[stackPointer-1];
        if (previousFrame != null) { previousFrame.setVisible(true); }
        
        windowStack[stackPointer-1] = previousFrame;
        
        JFrame currentFrame = windowStack[stackPointer];
        if (currentFrame != null) { currentFrame.setVisible(false); }
        
        return windowStack;
    }
    
    public static Card[] chooseClass(String chosenClass) {
        Card[] cardList = displayCollection(chosenClass);
        deckClass = chosenClass;
        
        JFrame previousFrame = windowStack[stackPointer];
        
        if (previousFrame != null) { previousFrame.setVisible(false); }
        
        windowStack[stackPointer] = deckScreen;
        
        stackPointer++;
        
        return cardList;
    }
    
    public static Card[] displayCards(Card[] cardList) {
        resetDeckScreen();
        
        if(cardList == null) {
            String buttonText = "Error displaying cards";
            JLabel aLabel = new JLabel(buttonText);
            deckScreen.addCards(buttonText,buttonText,0);
            
            return cardList;
        }
        
        for(int i = 0; i < cardList.length; i ++) {
            Card aCard = cardList[i];
            if(aCard != null) {
                String buttonID = aCard.getID();
                String buttonText = "<html>" + aCard.getName() + "<br />Attack:" + aCard.getAttack() + " Health: " + aCard.getHealth() + " Cost: " + aCard.getCost() + "</html>";
                JButton cardButton = new JButton(buttonText);
                deckScreen.addCards(buttonID, buttonText,i);
            }
        }
        
        deckScreen.setVisible(true);
        
        return cardList;
    } 
    
    private static void resetDeckScreen() {
        deckScreen.jPanel1.removeAll();
        deckScreen.jPanel1.revalidate();
        deckScreen.jPanel1.repaint();
    }
    
    public static String[] displayCards(String[] cardList) {
        resetDeckScreen();
        
        if(cardList == null) {
            String buttonText = "Error displaying cards";
            JLabel aLabel = new JLabel(buttonText);
            deckScreen.addCards(buttonText,buttonText,0);
            
            return cardList;
        }
        
        for(int i = 0; i < cardList.length; i ++) {
            String aCard = cardList[i];
            if(aCard != null) {
                JButton cardButton = new JButton(cardList[i]);
                deckScreen.addCards(cardList[i], cardList[i],i);
            }
        }
        
        if(!deckScreen.isVisible()) { deckScreen.setVisible(true); }
        else {
            deckScreen.jPanel1.revalidate();
            deckScreen.jPanel1.repaint();
            deckScreen.repaint();
        }
        
        return cardList;
    } 
    
    public static Card[] displayCollection(String chosenClass) {
        CardCollection allCards;
        
        if(chosenClass.isEmpty()) {
            allCards = new CardCollection();
        }
        else {
            allCards = new CardCollection(chosenClass);
        }
        
        for(int i = 0; i < allCards.getSize(); i ++) {
            Card aCard = allCards.get(i);
            if(aCard != null) {
                String buttonID = aCard.getID();
                String buttonText = "<html>" + aCard.getName() + "<br />Attack:" + aCard.getAttack() + " Health: " + aCard.getHealth() + " Cost: " + aCard.getCost() + "</html>";
                JButton cardButton = new JButton(buttonText);
                deckScreen.addCards(buttonID, buttonText,i);
            }
        }
        
        deckScreen.setVisible(true);
        
        return allCards.toArray();
    }
    
    public static Deck add(JButton button) {
        String buttonID = button.getName();
        
        String addTrue = deck.add(buttonID);
        
        if(addTrue == null) {
            // Grab card from card collection
            Card aCard = cards.get(buttonID);

            String buttonName = aCard.getName();

            System.out.println(aCard);

            deckScreen.addCardLabel(buttonID, buttonName, deck.getNext());
            deckScreen.addRemoveButton(buttonID, deck.getNext());

            deckScreen.revalidate();
            deckScreen.repaint();
        }
        
        return deck;
    }
    
    public static Deck remove(JButton button) {
        String buttonID = button.getName();
        
        String removeTrue = deck.remove(buttonID);
        
        if(removeTrue == null) {
            // Grab card from card collection
            Card aCard = cards.get(buttonID);

            String buttonName = aCard.getName();

            System.out.println(aCard);

            deckScreen.remove(buttonID);

            deckScreen.revalidate();
            deckScreen.repaint();
        }
        
        return deck;
    }
}
