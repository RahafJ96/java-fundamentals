package basiclibrary;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class testWeatherAnalyze {
    private Library weather;
    private int[][] testData;

    @BeforeEach
    public void setUp() throws Exception{
        weather = new Library();

        testData = new int[][]{
                {66, 64, 60, 65, 69, 61, 60},
                {59, 65, 65, 70, 62, 65, 58},
        };


    }


    @Test
    @DisplayName("Test for two Arrays")
    public void testForTwo() {
        int result = weather.analyzeWeatherData(testData);
        assertEquals(70 , result);
    }

}