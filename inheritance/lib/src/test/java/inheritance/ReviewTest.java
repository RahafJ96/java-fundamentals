package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReviewTest {
    Review rev;

    @BeforeEach
    public void init() {
        rev = new Review("good" , "user" , 2);
    }

    @Test
    public void testConstructor () {
        String expectedAuth = "user";
        String expectedBody = "good";
        int expectedStars = 2;
        assertEquals(expectedStars , 2);
        assertEquals(expectedAuth , "user");
        assertEquals(expectedBody , "good");
    }

    @Test
    public void testToString() {
        assertNotEquals(null , rev.toString());
    }
}