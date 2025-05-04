// Girilen bir sayıyı ters çeviren bir metot yaz.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int t = reverseNumber(n);
        System.out.println("The reversed number is: " + t);
    }

    static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }
    // Metot açıklaması: Sayının 10 ile bölümünden kalanını reversed
    // değerine atadık. Ardından sayıyı 10 a bölüp sayıyı güncelledik.
    // Sonrasında reversed değerini sondaki değerin basamak değerini
    // başa alabilmek için her döngüde 10 ile çarptık ve yine kalanı
    // üzerine ekledik. Girdi -> 123 , Çıktı adım adım şu şekilde
    // ": 3 -> 32 -> 321 son." olur.

}
