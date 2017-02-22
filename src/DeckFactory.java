import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
        Deck d = createSortedDeck();
        Dealer dlr = new StandardDealer();
        dlr.shuffle(d);
        return d;
    }

    private CardNumber createCardFromInt(int i){
        if(i < 1 || i > 13){
            throw new IllegalArgumentException("Cards can only have value between 1 and 13");
        }
        for(CardNumber c: CardNumber.values()) {
            if (c.getValue() == i) {
                return c;
            }
        }
        throw new IllegalStateException(String.format("Card value not found for supplied int %d",i));
    }

    public Deck createUnitialisedDeck(){
        List<Card> cards = new ArrayList<Card>(52);
        Deck d = new Deck(cards);
        return d;
    }

    public Deck createSortedDeck(){
        Deck d = createUnitialisedDeck();
        for(CardSuit s : CardSuit.values()){
            for(CardNumber n : CardNumber.values()){
                d.getCards().add(new Card(n, s));
            }
        }
        return d;
    }
}
