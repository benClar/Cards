/**
 * Created by benjaminclarke on 22/02/2017.
 */

import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck (List<Card> _cards){
         cards = _cards;
    }

    public List<Card> getCards(){
        return this.cards;
    }
}
