package basiclibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class testTally {
    private Library tally;
    List<String> votes = new ArrayList<>();
    @BeforeEach
    public void setUp() throws Exception {
        tally = new Library();

        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
    }

    @Test
    @DisplayName("test for 2 Candidates")
    public void testForTwo() {
        assertEquals("Bush" ,tally.tally(votes) , "Returns the winner");
    }
}