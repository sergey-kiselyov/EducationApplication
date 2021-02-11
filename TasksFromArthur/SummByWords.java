package TasksFromArthur;

import java.util.Scanner;

public class SummByWords extends mainPageSummByWords {
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
}






