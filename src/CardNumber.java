/**
 * Created by benjaminclarke on 22/02/2017.
 */
public enum CardNumber {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int value;

    CardNumber(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static CardNumber createCardFromInt(int i){
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

}
