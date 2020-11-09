import java.util.Scanner;

public class addNumbers {

    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a first number between 1 to 10");
        firstNumber = number.nextInt();
        System.out.println("Please enter a second number between 1 to 10");
        secondNumber = number.nextInt();
        int z = firstNumber + secondNumber;
        System.out.println("Your Total Number is " + z);
        int finalNumber = z + 30;
        System.out.println("Your Final Number is " + finalNumber);
    }
}
