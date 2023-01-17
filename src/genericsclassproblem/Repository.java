package genericsclassproblem;

import java.util.Scanner;

public class Repository {
    public void getInputByUser() {
        Float firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first Float number : ");
        firstNumber = scanner.nextFloat();

        System.out.print("Enter the Second Float number : ");
        secondNumber = scanner.nextFloat();

        System.out.print("Enter the Third Float number : ");
        thirdNumber = scanner.nextFloat();

        findMaxNumber(firstNumber, secondNumber, thirdNumber);
    }

    private void findMaxNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First number is grater");
            } else
                System.out.println("Third number is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second number is greater");
        else
            System.out.println("Third number is greater");
    }
}
