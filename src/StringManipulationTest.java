import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationTest {
    @Test
    public void testReverseAndReplace() {
        assertEquals("dlr15w", StringManipulation.reverseAndReplace("world"));
        assertEquals("b2c3d4f1", StringManipulation.reverseAndReplace("fddcb"));
        assertEquals("n6t5h4i3r2d1a", StringManipulation.reverseAndReplace("Adrian the mentor"));
        assertEquals("a", StringManipulation.reverseAndReplace("a"));
        assertEquals("1", StringManipulation.reverseAndReplace("e"));
        assertEquals("", StringManipulation.reverseAndReplace(""));
    }

    private void assertEquals(String dlr15w, String world) {

    }
}

