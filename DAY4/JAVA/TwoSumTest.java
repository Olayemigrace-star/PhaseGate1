import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest{

        @Test
        public void testThatTwoSumReturnsAnArrayOfSum(){
        
        int[] number = {8, 2, 4, 6,-2};
        int[] expected = {16, 10, 12, 14, 6};
        int[] actual = TwoSum.returnSum(number);
        assertArrayEquals(expected, actual);
        
        
        
        }
        @Test
        public void testThatTwoSumReturnsAnArrayOfSum(){
        
        int[] number = {8, 2, 4, 6,-2};
        int number = 6;
        int[] expected = {8, -2};
        int[] actual = TwoSum.returnSum(number);
        assertArrayEquals(expected, actual);
        
        
        
        }

}




