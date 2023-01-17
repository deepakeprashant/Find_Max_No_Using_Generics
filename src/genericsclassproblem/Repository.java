package genericsclassproblem;

import java.util.Scanner;

public class Repository {
    public void getInputByUser() {
        String firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first String : ");
        firstNumber = scanner.next();

        System.out.print("Enter the Second String : ");
        secondNumber = scanner.next();

        System.out.print("Enter the Third String : ");
        thirdNumber = scanner.next();

        findMaxNumber(firstNumber, secondNumber, thirdNumber);
    }

    private void findMaxNumber(String firstNumber, String secondNumber, String thirdNumber) {
        if ((firstNumber.compareTo(secondNumber) > 0)) {
            if ((firstNumber.compareTo(thirdNumber) > 0)) {
                System.out.println("First String is grater");
            } else
                System.out.println("Third String is greater");
        } else if ((secondNumber.compareTo(thirdNumber)) > 0)
            System.out.println("Second String is greater");
        else
            System.out.println("Third String is greater");
    }
}
