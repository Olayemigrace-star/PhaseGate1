import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int table = 1;
for (int num = 1; num <= 12;num++){
table = number * num;
System.out.println(number + " X " + num + " = " + table);
}

}

}
