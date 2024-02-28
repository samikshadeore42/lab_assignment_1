package lab_assignment_1;
import java.util.Scanner;

public class MonsterHealth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: N H X
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int X = scanner.nextInt();

        // Input: P1 P2 P3 ... PN
        int[] items = new int[N];
        for (int i = 0; i < N; i++) {
            items[i] = scanner.nextInt();
        }

        // Find the least effective item that can reach the desired health level
        int leastEffectiveItem = -1;
        for (int i = 0; i < N; i++) {
            if (H + items[i] >= X) {
                leastEffectiveItem = i + 1;  // Item numbers are 1-based
                break;
            }
        }

        // Output the result
        System.out.println(leastEffectiveItem);

        scanner.close();
    }
}
