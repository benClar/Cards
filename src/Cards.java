/**
 * Created by benjaminclarke on 22/02/2017.
 */
public class Cards {
    public static void main(String[] args){
        Dealer d = new StandardDealer();
        Deck shuffled = DeckFactory.getInstance().createShuffledDeck();
        d.sort(shuffled);
        shuffled.getCards().forEach(System.out::println);
    }
}