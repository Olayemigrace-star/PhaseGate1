import java.util.Scanner;

public class TaskFive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the Temperature in Celcius: ");
double celcius = input.nextInt();

double fahrenheit = ((9/5) * (celcius)) + 32;
System.out.println(fahrenheit + "Fahrenheit");

}
}
