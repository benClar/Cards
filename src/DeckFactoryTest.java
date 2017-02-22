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
    }

}