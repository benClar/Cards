import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by benjaminclarke on 22/02/2017.
 */
public class DeckFactoryTest {

    @Test
    public void testCreateUnitializedDeck(){
        DeckFactory df =  DeckFactory.getInstance();
        Deck d = df.createUnitialisedDeck();
        for(Card c : d.getCards()){
            assertEquals(c, null);
        }
        assertEquals(d.getDeckSize(), 0);

    }

    @Test
    public void testCreateShuffledDeck(){
        DeckFactory df =  DeckFactory.getInstance();
        Deck d = df.createShuffledDeck();
        d.getCards().forEach((Card c) -> assertNotNull(c));
        assertEquals(d.getDeckSize(), 52);
    }

    @Test
    public void testCreateSortedDeck(){
        DeckFactory df =  DeckFactory.getInstance();
        Deck d = df.createSortedDeck();
        d.getCards().forEach((Card c) -> assertNotNull(c));
        assertEquals(d.getDeckSize(), 52);
    }
}