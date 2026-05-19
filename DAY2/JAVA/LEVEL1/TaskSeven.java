import java.util.Scanner;

public class TaskSeven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the radius of the circle: ");
double radius = input.nextDouble();

double circumference = (2 * 3.142 * radius);
System.out.println("The Circumference of the Circle is " + circumference);

}
}
