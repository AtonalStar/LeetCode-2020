import static org.junit.Assert.*;
import org.junit.Test;

public class SingleNumberTest {
    int[] array = {1, 1, 4, 3, 3};
    @Test
    public void testSingleNumber(){
        SingleNumber sn = new SingleNumber();
        int result = sn.singleNumber(this.array);
        assertEquals(4, result);
    }

    @Test
    public void testBestSingleNumber(){
        SingleNumber sn = new SingleNumber();
        int result = sn.betterSolution(this.array);
        assertEquals(4, result);
    }
}

/*
 To run the test: run "mvn compile" "mvn test"
 */