package lab_assignment_1;
import java.io.*;
import java.util.*;

public class q4 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0, b = 0, c = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            char ch = s.charAt(i);
            if (ch == 'A')
                a++;
            if (ch == 'B')
                b++;
            if (ch == 'C')
                c++;

            if (a >= 1 && b >= 1 && c >= 1) {
                System.out.println(count);
                break;
            }
        }
        sc.close();
    }
}