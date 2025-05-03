public class RepeatedNumbersWithLoops {
    public static void main(String[] args) {
        int[] numbers = {2,3,7,2,4,3,5,2};
        boolean[] visited = new boolean[numbers.length];

        System.out.println("Tekrar eden sayılar: ");

        for (int i = 0; i < numbers.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(numbers[i] + "-> " + "count: " + count);
            }
        }
    }
}
