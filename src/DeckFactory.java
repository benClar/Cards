import java.util.ArrayList;
import java.util.List;

/**
 * Created by benjaminclarke on 22/02/2017.
 */
public class DeckFactory {

    private static DeckFactory instance;

    private DeckFactory(){

    }


    public static DeckFactory getInstance() {
        if(instance == null) {
            instance = new DeckFactory();
        }
        return instance;
    }

    public Deck createShuffledDeck(){
        Deck d = createUnitialisedDeck();
        return d;
    }
    public Deck createUnitialisedDeck(){
        List<Card> cards = new ArrayList<Card>(52);
        Deck d = new Deck(cards);
        return d;
    }

    public Deck createSortedDeck(){
        Deck d = createUnitialisedDeck();
        return d;
    }
}
