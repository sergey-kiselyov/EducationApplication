package stringOutput;

import java.util.Scanner;

public class numberic {
    public static void main(String[] args) {
        System.out.print("Enter any number form 1 to 1000: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("Result " + result);
    }
}
