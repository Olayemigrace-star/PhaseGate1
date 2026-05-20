import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ParkingSlotTest{

        @Test
        public void testThatTheArrayHasTwentySlots(){
        
        int [] number = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        
        
        int [] expectednumber = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        
        int[] actual = ParkingSlot.carSlot(number);
        assertArrayEquals(expectednumber, actual);
        
        
        }




}

