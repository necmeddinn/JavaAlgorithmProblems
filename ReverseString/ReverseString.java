// Kullanıcıdan bir metin al, tersten yazdır.
//Örnek: Girdi: Necmeddin → Çıktı: niddemceN

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Metni aldık

        System.out.print("Reverse state: ");
        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        // Diziyi son indeksten gezerek karakterleri yazdık.
    }
}
