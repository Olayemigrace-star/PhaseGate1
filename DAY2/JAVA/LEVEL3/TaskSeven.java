import java.util.Scanner;

public class TaskSeven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum = 0;
for (int num = 1; num <= 5;num++){
System.out.print("Enter a number: ");
int number = input.nextInt();

sum += number;

}
System.out.println(sum);
}

}
