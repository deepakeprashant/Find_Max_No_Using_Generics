package genericsclassproblem;

import java.util.Scanner;

public class Repository {
    void inputInteger() {

        Integer firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the integer values only.");
        System.out.print("Enter the first number : ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the Second number : ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter the Third number : ");
        thirdNumber = scanner.nextInt();

        GenericClass genericClass = new GenericClass(firstNumber, secondNumber, thirdNumber);
        genericClass.testMaximum();
    }

    void inputFloat() {

        Float firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Enter the float values only.");
        System.out.print("Enter the first number : ");
        firstNumber = scanner.nextFloat();

        System.out.print("Enter the Second number : ");
        secondNumber = scanner.nextFloat();

        System.out.print("Enter the Third number : ");
        thirdNumber = scanner.nextFloat();

        GenericClass genericClass = new GenericClass(firstNumber, secondNumber, thirdNumber);
        genericClass.testMaximum();
    }

    void inputString() {

        String firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the string values only.");
        System.out.print("Enter the first string : ");
        firstNumber = scanner.nextLine();

        System.out.print("Enter the Second string : ");
        secondNumber = scanner.nextLine();

        System.out.print("Enter the Third string : ");
        thirdNumber = scanner.nextLine();

        GenericClass genericClass = new GenericClass(firstNumber, secondNumber, thirdNumber);
        genericClass.testMaximum();
    }
}
