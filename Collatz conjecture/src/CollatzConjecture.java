import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate and display the Collatz sequence
            System.out.print("Collatz sequence: ");
            collatzSequence(num);
        }

        scanner.close();
    }

    // Function to calculate and display the Collatz sequence
    public static void collatzSequence(int n) {
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }

        System.out.println(); // Move to the next line after the sequence
    }
}