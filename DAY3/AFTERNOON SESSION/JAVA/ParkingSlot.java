import java.util.Arrays;

public class ParkingSlot {

    public static int[] carSlot(int[] cars){
        
        cars = new int[20];
        
        int freeSpace = 0;
        int cont = 0;
       for (int index = 0; index < cars.length; index++){
     
       if (cars[index] == freeSpace[cont++]){
       cars[index] = 1;
       }
      
       return cars[index];
    }
    }


}








