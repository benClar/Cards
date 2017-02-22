
/**
 * Created by benjaminclarke on 22/02/2017.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardNumbersTest {

    @Test
    public void enumToInt(){
        assertEquals(CardNumber.TWO.getValue(), 2);
    }

}