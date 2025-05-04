// Kullanıcının yaşının 18 den büyük veya küçük olduğunun kontrolünü,
// metot kullanarak yaz.

import java.util.Scanner;

public class CheckAge {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are under 18 years old");
        } else {
            System.out.println("You are older than 18 years old");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkAge(age);
    }
}
