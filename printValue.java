import java.util.Scanner;

public class printValue {

    public static void main(String[] args){

        int number;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a number");
        number = value.nextInt();
        System.out.println("Your number is " + number);
    }
}
