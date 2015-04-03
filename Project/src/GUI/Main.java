package GUI;
import Cards.*;
import Deck.*;
import java.awt.*;
import java.awt.Frame;
import javax.swing.*;

public class Main {
    
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
    
    // Main function
    public static void main(String[] args) {
        // Main menu is visible
        main.setVisible(true);
        
        // Update window stack
        windowStack[stackPointer] = main;
        stackPointer++;
    }
    
    // New deck
    public static Deck newDeck() {
        // Choose class screen
        chooseClass = new ChooseClass();
        chooseClass.setVisible(true);
        
        // Update stack
        JFrame previousFrame = windowStack[stackPointer-1];
        
        windowStack[stackPointer] = chooseClass;
        
        // Close previous screen
        previousFrame.setVisible(false);
        
        return deck;
    }
    
    // Searching for a card
    public static String[] search(JTextField search) {
        // Search with keyword from text field
        String keyword = search.getText();
        
        cards = new CardCollection(deckClass);
        
        String[] results = cards.query(keyword);
        
        // Get results and display them
        displayCards(results);
        
        return results;
    }
    
    // Main Menu screen
    public static JFrame mainMenu() {
        // Update stack, close previous screen, open main menu
        JFrame previousFrame = windowStack[stackPointer-1];
        
        previousFrame.setVisible(false);
        
        main.setVisible(true);
        
        windowStack[stackPointer-1] = main;
        
        stackPointer -= 1;
        
        return windowStack[stackPointer];
    }
        
    // Load Deck secreen
    public static JFrame loadDeck() {
        // Load Deck screen visible
        loadDeck = new LoadDeck();
        loadDeck.setVisible(true);
        
        // Update stack
        windowStack[stackPointer] = loadDeck;
        JFrame previousFrame = windowStack[stackPointer-1];
        
        // Remove previous frame
        previousFrame.setVisible(false);
        
        return windowStack[stackPointer];
    }
    
    // Save Deck screen
    public static JFrame saveDeck() {
        // Visible save deck screen
        saveDeck = new SaveDeck();
        saveDeck.setVisible(true);
        
        // Update stack
        windowStack[stackPointer] = saveDeck;
        JFrame previousFrame = windowStack[stackPointer-1];
        
        // Remove previous frame
        previousFrame.setVisible(false);
        
        return windowStack[stackPointer];
    }
    
    // Back function
    public static JFrame[] back() {
        // Update stack to go back to previous frame
        JFrame previousFrame = windowStack[stackPointer-1];
        if (previousFrame != null) { previousFrame.setVisible(true); }
        
        windowStack[stackPointer-1] = previousFrame;
        
        JFrame currentFrame = windowStack[stackPointer];
        if (currentFrame != null) { currentFrame.setVisible(false); }
        
        return windowStack;
    }
    
    // Initialize after choosing a class
    public static Card[] chooseClass(String chosenClass) {
        // Get the cards for chosen class
        Card[] cardList = displayCollection(chosenClass);
        deckClass = chosenClass;
        
        // Close previous frame
        JFrame previousFrame = windowStack[stackPointer];
        
        if (previousFrame != null) { previousFrame.setVisible(false); }
        
        // Update stake
        windowStack[stackPointer] = deckScreen;
        
        stackPointer++;
        
        return cardList;
    }
    
    // Display cards in a Card[] list
    public static Card[] displayCards(Card[] cardList) {
        resetCardScreen();
        
        // If null list, display error message
        if(cardList == null) {
            String buttonText = "Error displaying cards";
            JLabel aLabel = new JLabel(buttonText);
            deckScreen.addCards(buttonText,buttonText,0);
            
            return cardList;
        }
        
        // Go through cardList and add buttons to the deckScreen
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
    
    // Reset cardcollections
    private static void resetCardScreen() {
        deckScreen.jPanel1.removeAll();
        deckScreen.jPanel1.revalidate();
        deckScreen.jPanel1.repaint();
    }
    
    // Reset deck screen
    private static void resetDeckScreen() {
        deckScreen.DeckPane.removeAll();
        deckScreen.DeckPane.revalidate();
        deckScreen.DeckPane.repaint();
    }
    
    // Display cards in String[] array
    public static String[] displayCards(String[] cardList) {
        resetCardScreen();
        
        // Display error if cardList is null
        if(cardList == null) {
            String buttonText = "No cards to be displayed.";
            JLabel aLabel = new JLabel(buttonText);
            deckScreen.addCards(buttonText, buttonText ,0);
            
            String[] error = new String[1];
            error[0] = buttonText;
            
            return error;
        }
        
        // Go through cardList and add each card to the deckScreen
        for(int i = 0; i < cardList.length; i++) {
            String ID = cardList[i];
            
            if(ID != null) {
                if(ID.equalsIgnoreCase("No results.")) {
                    deckScreen.addCards("No results.", "No results.", 0);
                    return cardList;
                }
                if(!ID.isEmpty()) {
                    
                    Card card = cards.get(ID);

                    String buttonText = "<html>" + card.getName() + "<br />Attack:" + card.getAttack() + " Health: " + card.getHealth() + " Cost: " + card.getCost() + "</html>";

                    deckScreen.addCards(ID, buttonText, i);
                }
            }
        }
        
        // Update the deck screen
        if(!deckScreen.isVisible()) { deckScreen.setVisible(true); }
        else {
            deckScreen.jPanel1.revalidate();
            deckScreen.jPanel1.repaint();
            deckScreen.repaint();
        }
        
        return cardList;
    } 
    
    // Display all cards available
    public static Card[] displayCollection(String chosenClass) {
        CardCollection allCards;
        
        // If no chosen class specified, get all card
        if(chosenClass.isEmpty()) {
            allCards = new CardCollection();
        }
        // Get cards specific to class
        else {
            allCards = new CardCollection(chosenClass);
        }
        // Go through card list and add buttons to deckScreen
        for(int i = 0; i < allCards.getSize(); i ++) {
            Card aCard = allCards.get(i);
            if(aCard != null) {
                String buttonID = aCard.getID();
                String buttonText = "<html>" + aCard.getName() + "<br />Attack:" + aCard.getAttack() + " Health: " + aCard.getHealth() + " Cost: " + aCard.getCost() + "</html>";
                JButton cardButton = new JButton(buttonText);
                deckScreen.addCards(buttonID, buttonText,i);
            }
        }
        
        // Make deck screen visible
        deckScreen.setVisible(true);
        
        return allCards.toArray();
    }
    
    // Function when adding cards
    public static Deck add(JButton button) {
        String buttonID = button.getName();
        
        String addTrue = deck.add(buttonID);
        
        // If add was successful
        if(addTrue == null) {
            // Grab card from card collection
            Card aCard = cards.get(buttonID);

            String buttonName = aCard.getName();
            
            // Add label and remove button
            deckScreen.addCardLabel(buttonID, buttonName, deck.getNext());
            deckScreen.addRemoveButton(buttonID, deck.getNext());

            // Redraw deckscreen
            deckScreen.revalidate();
            deckScreen.repaint();
        }
        
        return deck;
    }
    
    // Remove function
    public static Deck remove(JButton button) {
        String buttonID = button.getName();
        
        String removeTrue = deck.remove(buttonID);
        
        // If remove was successful from deck
        if(removeTrue != deck.cannotRemove()) {
            // Reset deckscreen
            resetDeckScreen();
            // Go through deck and redraw all cards
            for(int i = 0; i < deck.size(); i++) {
                String newID = deck.get(i);
                if(newID != null) {
                    // Look for card in card collection
                    String newName = cards.get(newID).getName();

                    deckScreen.addCardLabel(newID, newName, i);
                    deckScreen.addRemoveButton(newID, i);
                }
            }
            
            // Repaint deckscreen with changes
            deckScreen.revalidate();
            deckScreen.repaint();
        }
        
        return deck;
    }
}
