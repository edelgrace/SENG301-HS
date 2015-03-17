package Cards;

public class Search {
    private CardCollection allCards;
    private int cardSize;
    
    
    public Search() {
        allCards = new CardCollection();
        cardSize = allCards.getSize();
    }
    
    public String[] query(String searchTerm) {
        String[] result = new String[1];
                
        if(searchTerm == null || searchTerm.isEmpty()) {
            result[0] = "No search term was entered. Please try again.";
            return result;
        }
        
        result = findCard(searchTerm);
        
        return result;
    }
    
    public String[] findCard(String searchTerm) {
        String[] result = new String[cardSize];
        int pointer = 0;
        
        for(int i = 0; i < cardSize; i++) {
            Card aCard = allCards.get(i);
            String aCardName = aCard.getName();
            
            if(aCardName.contains(searchTerm)) {
                result[pointer] = aCardName;
                pointer++;
            }
        }
        
        for(int i = 0; i < cardSize; i++) {
            if(result[i] != null) {
                return result;
            }
        }
        
        result = new String[1];
        result[0] = "No results.";
        
        return result;
    }
}
