import java.util.Scanner;
import java.util.Arrays;

public class FacebookLikeSystem {

public static String[] likes(String[] names){

String[] records = new String [names.length];

int j = 0;
for (int i = 0; i < names.length; i++){
//if (names[i] > 3){
//return names[0] && names[1] +([j++] - 2);
//}
if (names.length == 2){
  records[j++] = names[i];

}
//else if (names[i] > 3){

//
//}
//
}
return records;
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);

String[] names = {"yemi", "ray", "bolu", "victor"};
System.out.print(Arrays.toString(likes(names)));

}
}
