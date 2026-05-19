import java.util.Scanner;

public class TaskNine{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("What is price of the item: ");
double price = input.nextInt();

double tax = price + (0.1 * price);
System.out.println("Your V.A.T is " + tax);

}
}
