import static org.junit.Assert.*;
import org.junit.Test;

public class HappyNumberTest {
    @Test
    public void testIsHappy(){
        HappyNumber hn = new HappyNumber();
        assertTrue(hn.isHappy(19));
        assertFalse(hn.isHappy(20));
    }
    @Test
    public void testIsBetterHappy(){
        HappyNumber hn = new HappyNumber();
        assertTrue(hn.isBetterHappy(19));
        assertFalse(hn.isBetterHappy(20));
    }
}
