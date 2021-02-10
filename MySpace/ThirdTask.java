package MySpace;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 2 текстовых числа от one до ten");

        String snumber1 = scanner.next();
        String snumber2 = scanner.next();

        int inumber1 = 0;
        inumber1 = switchNumber(snumber1, inumber1);
        int inumber2 = 0;
        inumber2 = switchNumber(snumber2, inumber2);

        int sum = inumber1 + inumber2;
        System.out.println(numberToWord(sum));
    }

    public static int switchNumber(String snumber, int number) {
        switch (snumber) {
            case "one":
                number = 1;
                break;
            case "two":
                number = 2;
                break;
            case "three":
                number = 3;
                break;
            case "four":
                number = 4;
                break;
            case "five":
                number = 5;
                break;
            case "six":
                number = 6;
                break;
            case "seven":
                number = 7;
                break;
            case "eight":
                number = 8;
                break;
            case "nine":
                number = 9;
                break;
            case "ten":
                number = 10;
                break;
            default:
                System.out.println("Значение не верно, введите число от one до ten");
        }
        return number;
    }

    private static String numberToWord(int number) {
        String words = "";
        String unitsArray[] = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twelve"};

        if (number <= 20) {
            words += unitsArray[number];
        }
        return words;
    }
}
