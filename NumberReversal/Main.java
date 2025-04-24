import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.println("Enter a positive number: ");
                String input = scanner.nextLine();

                number = Integer.parseInt(input);

                if (number <= 0) {
                    throw new NumberFormatException("Number must be positive");
                }

                break; // Doğru giriş yapılırsa döngüden çık
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
                System.out.println("Enter a positive number.\n");
            }
        }

        // Doğru girişten sonra burada ters çevirme yapılır
        StringBuilder reversed = new StringBuilder(String.valueOf(number)).reverse();
        System.out.println("Reversed number: " + reversed);
    }
}

