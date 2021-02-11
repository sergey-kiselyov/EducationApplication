package TasksFromArthur;

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
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("ninth");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("What are you doing?");
        }
    }
}

