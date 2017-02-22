import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by benjaminclarke on 22/02/2017.
 */
public class StandardDealer  implements Dealer {

    public void search(Deck d){

    }

    public void sort(Deck d){
        d.getCards().sort((Card a, Card b) -> a.compareTo(b));
    }

    public void shuffle(Deck d){
        for(int i = 0; i < 52; i++){
            int dest = ThreadLocalRandom.current().nextInt(0, 52);
            d.swap(i, dest);
        }
    }



}
