package TasksFromArthur;

import java.util.Scanner;

public class SummByWords {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input two words as number, for example " + "'One'");
        String number1 = k.nextLine();
        String number2 = k.nextLine();
        int result = 0;
        String resultInWords = "";
        try {
            result = convertToInt(number1) + convertToInt(number2);
            resultInWords = convertToWords(result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(resultInWords);
    }

    public static int convertToInt(String numbers) throws Exception {
        switch (numbers) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;

        }
        throw new Exception("Wrong String Parameters");
    }

    public static String convertToWords(int resultInWords) throws Exception {
        switch (resultInWords) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "ninth";
            case 10:
                return "ten";
        }
        throw new Exception("Can't convert to String");
    }

}






