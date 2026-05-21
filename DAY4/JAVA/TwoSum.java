
import java.util.Arrays;

public class TwoSum{

public static int[] returnSum(int[] array){

array = new int[5];
int[] sum = new int[2];

//for (int i = 0; i < array.length; i++){
//if (array[0] + array[i] == number){
//sum = (array[0] + array[i]);
//}
//}
//
//return sum;
//
//}
//
//


//
for (int i = 0; i < array.length; i++){
//if ((array[i] + array[i] + 1) == number){
if (array[i] + (array[i] + 1)){
sum = {array[i] , (array[i] + 1)};

}
}
return sum;

}


}


