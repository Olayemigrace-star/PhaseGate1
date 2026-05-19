import java.util.Scanner;

public class TaskTwo{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

if (number < 0){
System.out.println("It is a Negative Number");
}
else if(number > 0){
System.out.println("It a Positive Number");
}

}
}
