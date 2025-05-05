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

    // 🔧 Mantık:
    //	1.	text’i ters çevir
    //	2.	Küçük/büyük farkını yok et → toLowerCase()
    //	3.	İki string eşit mi? Karşılaştır ve sonucu döndür

    static boolean isPalindrome(String text) {
        text = text.toLowerCase().replace(" ", "");
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return text.equals(reversedText);
    }
}
