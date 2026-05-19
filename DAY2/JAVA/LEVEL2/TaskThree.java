import java.util.Scanner;

public class TaskThree{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your score: ");
int studentScore = input.nextInt();

if (studentScore <= 49){
System.out.println("Fail!");
}
else if(studentScore >= 50){
System.out.println("Pass");
}

}
}
