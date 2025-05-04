// Verilen bir string içindeki sesli harf sayısını bul ve geri döndür.

import java.util.Scanner;

public class VowellCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text message: ");
        String message = input.nextLine();

        int t = countVowels(message);
        System.out.println("Vowel count: " + t);
    }

    static int countVowels(String message) {
        String vowels = "aeiouöüı";
        String text = message.toLowerCase();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        // 🔧 Mantık:
        //	1.	Her karakteri gez
        //	2.	Karakter sesli harf mi? → if (vowels.indexOf(ch) != -1)
        //	3.	Sayacı artır
        //	4.	En son sayacı döndür
        return count;
    }
}
