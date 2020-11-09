public class swapNumbers {
    public static void main(String[] args) {
        int thirdVariable;
        int firstNumber = 1;
        int secondNumber = 2;

        thirdVariable = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdVariable;

        System.out.println("First Number is " + firstNumber + " and Second Number is " + secondNumber);
    }
}
