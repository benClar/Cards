/**
 * Created by benjaminclarke on 22/02/2017.
 */

import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;
    private final int DECK_SIZE = 52;

    public Deck (List<Card> _cards){
         cards = _cards;
    }

    public List<Card> getCards(){
        return this.cards;
    }

    public void swap(int a, int b){
        Collections.swap(this.cards, a, b);
    }

    public int getDeckSize(){
        int i = 0;
        for(Card c : this.cards){
            if(c != null) {
                i++;
            }
        }
        return i;
    }
}
