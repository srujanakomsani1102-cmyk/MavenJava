import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testAddition() {
        assertEquals(30, Main.add(10, 20));
    }
}