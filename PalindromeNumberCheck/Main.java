//        Soru: Bir sayının palindrom olup olmadığını kontrol eden bir Java programı yaz. (Palindrom: Tersten yazıldığında da aynı olan sayı)
//        Örnek:
//        Girdi: 1221 → Çıktı: true
//        Girdi: 1234 → Çıktı: false

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Giriş kontrolü
        while (true) {
            try {
                System.out.print("Bir pozitif tam sayı girin: ");
                String input = scanner.nextLine();

                number = Integer.parseInt(input);

                if (number <= 0) {
                    throw new NumberFormatException("Pozitif bir sayı girilmedi.");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Hatalı giriş: " + e.getMessage());
            }
        }

        // Palindrom kontrolü
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Bu bir palindrom sayıdır.");
        } else {
            System.out.println("Bu bir palindrom sayı değildir.");
        }
    }
}