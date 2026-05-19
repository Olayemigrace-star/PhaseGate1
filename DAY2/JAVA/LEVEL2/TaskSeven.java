import java.util.Scanner;

public class TaskSeven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your password: ");
String passWord = input.nextLine();

if (passWord .equals("admin123")){
System.out.println("Welcome");
}
else{
System.out.println("Invalid Password");
}

}
}
