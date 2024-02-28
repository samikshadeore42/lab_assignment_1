package lab_assignment_1;
import java.io.*;
import java.util.*;

class q3 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int min = 0, ans = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (h + arr[i] >= x) {
                if (flag) {
                    ans = arr[i];
                    flag = false;
                }
                if (ans > arr[i]) {
                    min = i;
                    ans = arr[i];
                }
            }
        }

        System.out.println(min + 1);
        sc.close();
    }
}