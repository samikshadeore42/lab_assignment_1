package lab_assignment_1;

import java.util.Scanner;

public class CheckCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: String S
        String S = scanner.nextLine();

        int countA = 0, countB = 0, countC = 0;
        int checkedCharacters = 0;

        // Check characters from the left until all A, B, and C appear at least once
        for (char ch : S.toCharArray()) {
            checkedCharacters++;

            // Update counts for A, B, and C
            if (ch == 'A') {
                countA++;
            } else if (ch == 'B') {
                countB++;
            } else if (ch == 'C') {
                countC++;
            }

            // Check if all A, B, and C have appeared at least once
            if (countA > 0 && countB > 0 && countC > 0) {
                break;
            }
        }

        // Output the result
        System.out.println(checkedCharacters);

        scanner.close();
    }
}
