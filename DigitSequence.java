package lab_assignment_1;
import java.util.Scanner;

public class DigitSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit integer (1 to 9): ");
        int N = scanner.nextInt();

        // Validate input
        if (N < 1 || N > 9) {
            System.out.println("Input must be a single-digit integer between 1 and 9, inclusive.");
        } else {
            // Construct the sequence by replicating the digit N
            StringBuilder sequence = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sequence.append(N);
            }

            System.out.println(sequence.toString());
        }
        scanner.close();
    }
}
