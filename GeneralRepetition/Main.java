public class Main {
    public static void main(String[] args) {
        int[] Ages = {21,32,43,12,43,45,75,87,34};
        float sum = 0;
        float avg;

        for (int age : Ages) {
            sum += age;
        }

        avg = (sum / Ages.length);

        System.out.println("Sum: " + sum);
        System.out.println(("Length: " + Ages.length));
        System.out.println("Avg: " + avg);

        //-------------------------------------------

        int lowestAge = Ages[0];
        for (int age : Ages) {
            if (lowestAge > age){
                lowestAge = age;
            }
        }
        System.out.println("Lowest age: " + lowestAge);
    }
}
