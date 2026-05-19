import java.util.Scanner;

public class Taskeight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the day number: ");
int weekDay = input.nextInt();


if(weekDay == 0){
System.out.println(" Sunday");
}
else if(weekDay == 1){
System.out.println("Monday");
}
else if(weekDay == 2){
System.out.print("Tuesday");
}
else if(weekDay == 3){
System.out.println("Wednessday");
}
else if(weekDay == 4){
System.out.println("Thursday");
}
else if(weekDay == 5){
System.out.println("Friday");
}
else if(weekDay == 0){
System.out.println("Saturday");
}
}
}

