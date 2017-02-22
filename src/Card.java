import java.util.Comparator;

/**
 * Created by benjaminclarke on 22/02/2017.
 */
public class Card implements Comparable<Card> {

    private CardNumber number;
    private CardSuit suit;

    public Card(CardNumber n, CardSuit s){
        this.number = n;
        this.suit = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (number != card.number) return false;
        return suit == card.suit;
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + suit.hashCode();
        return result;
    }

    @Override
    public int compareTo(Card c){
        Integer a = (this.suit.getValue() * 13) + this.number.getValue();
        Integer b = (c.suit.getValue() * 13) + c.number.getValue();
        return a.compareTo(b);
    }

    @Override
    public String toString(){
        return String.format("%s : %s", this.suit, this.number);
    }
}
