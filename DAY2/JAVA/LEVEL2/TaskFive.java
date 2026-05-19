import java.util.Scanner;

public class TaskFive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your first number: ");
int numOne = input.nextInt();
System.out.print("Enter your second number: ");
int numTwo = input.nextInt();
System.out.print("Enter your second number: ");
int numThree = input.nextInt();

int largest = numOne;
if (numTwo > largest){
largest = numTwo;
}
if (numThree > largest){
largest = numThree;


System.out.print(largest + " is the largest Number");
}
}
}
