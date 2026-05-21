import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AscendingNumberTest{

        @Test
        public void testThatTheArrayNumbersAreAscending(){
        
        int[] number = {9, 5, 11, 7, 8, 4, 5, 6, 13, 12, 10};
        int[] expected = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] actual = AscendingNumber.ascending(number);
        assertArrayEquals(expected, actual);
        
        
        
  
}
}



