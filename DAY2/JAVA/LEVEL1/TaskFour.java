import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your first number: ");
int numOne = input.nextInt();
System.out.print("Enter your second Number: ");
int numTwo = input.nextInt();

int product = numOne * numTwo;
System.out.println("The product of the numbers is " + product);

}
}
