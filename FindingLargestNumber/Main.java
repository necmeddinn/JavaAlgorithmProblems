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