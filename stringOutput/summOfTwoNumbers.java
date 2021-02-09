package stringOutput;

import java.util.Scanner;

public class summOfTwoNumbers {

        public static void main(String[] args) {

            Scanner k = new Scanner(System.in);
            System.out.println ("Введите 2 любых целых числа: ");
            int number1 = k.nextInt();
            int number2 = k.nextInt();
            System.out.print(number1 + number2);
        }
    }

