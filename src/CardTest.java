import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by benjaminclarke on 22/02/2017.
 */
public class CardTest {

    @Test
    public void testCompareTo() throws Exception {
        Card c1 = new Card(CardNumber.SEVEN, CardSuit.CLUB);
        Card c2 = new Card(CardNumber.EIGHT, CardSuit.CLUB);
        Card c3 = new Card(CardNumber.NINE,  CardSuit.DIAMOND);
        List<Card> l = new ArrayList<>();
        l.add(c2);
        l.add(c1);
        l.add(c3);

        l.sort((Card a, Card b)-> a.compareTo(b));
        assertEquals(l.get(0), c3);
        assertEquals(l.get(1), c1);
        assertEquals(l.get(2), c2);
    }

}