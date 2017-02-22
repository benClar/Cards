import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by benjaminclarke on 22/02/2017.
 */



public enum CardSuit {
    DIAMOND(1), SPADE(2), HEART(3), CLUB(4);

    private int value;

    CardSuit(int n){
        this.value = n;
    }

    public int getValue(){
        return this.value;
    }
}
