import java.util.Scanner;

public class TaskTwo{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your Age: ");
int age = input.nextInt();

int future = age + 5;
System.out.println("In 5 years time you will be " + future + " years old" );

}
}
