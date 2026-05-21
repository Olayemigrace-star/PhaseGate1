
import java.util.Arrays;

public class AscendingNumber{

public static int[] ascending(int[] array){

array = new int[11];
int[] sorted = new int[11];
int j = 0;
    for(int counter = 0; counter < array.length; counter++)
        if (array[counter] > array[counter] + 1){
    sorted[j++] = array[counter];
}
return sorted;

}


}


