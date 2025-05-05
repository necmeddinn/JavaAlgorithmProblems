//Amaç: Verilen bir metin (kelime veya cümle), tersten okunduğunda da
// aynıysa true döndür, değilse false.

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        boolean isPalindrome = isPalindrome(str);
        System.out.print("Is a palindrome? " + isPalindrome);
    }

    static boolean isPalindrome(String text) {
        text = text.toLowerCase().replace(" ", "");
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return text.equals(reversedText);
    }
}
