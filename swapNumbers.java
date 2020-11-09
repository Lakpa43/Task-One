public class swapNumbers {

    public static void main(String[] args){
        int firstNumber = 1;
        int secondNumber = 2;

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("First Number is " + firstNumber + " and Second Number is " + secondNumber);

    }
}
