import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your first number: ");
int numOne = input.nextInt();
System.out.print("Enter your second number: ");
int numTwo = input.nextInt();

if (numOne > numTwo){
System.out.println(numOne);
}
else{
System.out.println(numTwo);
}

}
}
