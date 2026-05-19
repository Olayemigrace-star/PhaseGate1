import java.util.Scanner;

public class TaskFive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int factorial = 1;
for (int num = number; num > 0;num--){
factorial *= num;
System.out.print(num + "* ");

}
System.out.println();
System.out.print(factorial);
}

}
