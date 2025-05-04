// 🧠 Görev: Kullanıcıdan alınan bir metindeki sesli harfleri
// say ve toplam kaç tane olduklarını ekrana yazdır.

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        // Kullanıcıdan string aldık.

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                // indexOf dizide karakter yoksa -1 verir.
                count++;
            }
        }
        // Döngünün içinde girilen stringin indexlerini sırayla ch ile
        // tutarak sesli harfler dizisinde bulunup bulunmama durumunu
        // kontrol ettik. Ardından var ise sayacı artırdık.

        System.out.println("Total number of vowels: " + count);
    }
}
