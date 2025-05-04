//Kullanıcıdan bir sayı al, o sayıya kadar Fibonacci dizisini yazdır.
//Örnek: Girdi: 10 → Çıktı: 0 1 1 2 3 5 8

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Fibonacci limit: ");
        int limit = sc.nextInt();
        // Buraya kadar Fibonacci dizisi için sınır değerini aldık

        int a = 0, b = 1;
        System.out.print("The Fibonacci number is: " + a);

        while (a <= limit) {
            System.out.print(" " + b);
            int temp = b;
            b = a + b;
            a = temp;
        }

    }
}
