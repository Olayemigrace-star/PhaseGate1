import java.util.Scanner;
public class Functions{

public static int sum(int numOne, int numTwo){
return numOne + numTwo;
}
public static int square(int number){
return number * number;
}
public static double faren(double number){
double fahrenheit = ((number) * (9 / 5)) + 32;
    return fahrenheit;
}
public static int bigest(int numOne, int numTwo, int numThree){
int largest = 0;
largest = numOne;
    if (largest < numTwo){
        largest = numTwo;
        }
    if (largest < numThree){
        largest = numThree;
        }
    return largest; 
    
}



    


public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println(sum(3, 4));
System.out.println(square(5));
System.out.println(faren(10));
System.out.println(bigest(10, 47, 9));



}
}
