import java.util.Scanner;

public class TaskTen{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first number: ");
int numOne = input.nextInt();
System.out.print("Enter the second Number: ");
int numTwo = input.nextInt();
System.out.print("Enter the third Number: ");
int numThree = input.nextInt();

int average = (numOne + numTwo + numThree) / 3;
System.out.println("The average is " + average);

}
}
