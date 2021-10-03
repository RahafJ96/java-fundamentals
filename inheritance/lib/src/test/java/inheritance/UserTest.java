package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserTest {
    Review rev;
    @BeforeEach
    public void init() {
        rev = new Review("review" , "user" , 2);
    }

    @Test
    public void testValues() {
        assertTrue(rev.body.length() > 0 && rev.body != null , "Should return true if not null and not empty");
        assertTrue(rev.starNo >= 0  , "Should return true if not null and not zero");
        assertTrue(rev.body.length() > 0 && rev.body != null , "Should return true if not null and not empty");
    }

    @Test

    public void testAverage() {
        Restaurant res = new Restaurant("res" , "$");
        res.addReview("hello" , "mohammed" , 1);
        res.addReview("Hello" , "Mohammed" , 2);
        res.addReview("Hello" , "Mohammed" , 3);

        assertTrue(res.getRate() == 2 , "Return true if the average is corrected right");
    }
}