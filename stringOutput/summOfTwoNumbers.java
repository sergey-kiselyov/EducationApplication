package stringOutput;

import java.util.Scanner;

public class summOfTwoNumbers {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Enter 2 numbers from 0 to 5: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        int result = number1 + number2;
        switch (result) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
            case 5:
                System.out.println("five");
            case 6:
                System.out.println("six");
            case 7:
                System.out.println("seven");
            case 8:
                System.out.println("eight");
            case 9:
                System.out.println("ninth");
            case 10:
                System.out.println("ten");
        }
    }
}

