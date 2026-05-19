import java.util.Scanner;
import java.util.Arrays;
public class Functions{

public static int[]sorted(int []number){
int j =0;
int[] value = new int [number.length];
for (int index = 0; index < number.length;index++){
if (number[index] % 2 == 1 && number[index] % number[index] == 0)
value[j++] = number[index];
}
return value;
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int[] array = {5,9,3,6,2};
System.out.println(Arrays.toString(sorted(array)));
}
}
