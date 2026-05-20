import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FacebookLikeSystemTest{

        @Test
        public void testThatTwoNamesArePassedIntoTheArray(){
        
        String[] names = {"yemi", "bolu"};
        
        String[] expectednames = {"yemi", "bolu"};
        
        String actual = FacebookLikeSystem.likes(names);
        assertArrayEquals(expectednames, actual);
        
        
        }




}

