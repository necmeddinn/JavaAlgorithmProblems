//Soru: Kullanıcıdan alınan 5 sayıyı diziye alarak, en büyük sayıyı bulan Java programı yaz.
//Örnek:
//Girdi: 3 9 2 15 6
//Çıktı: 15.

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10,21,32,35,76,85,34,23,65,89,35,67};
        
        int max = dizi[0];
        for (int x: dizi) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Dizi max: " + max);
    }
}