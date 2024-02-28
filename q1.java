package lab_assignment_1;
import java.io.*;
import java.util.*;

class q1 {
    public static void main(String args[]) throws IOException {
        Scanner scanf = new Scanner(System.in);
        int N = scanf.nextInt();
        System.out.print("A");
        for (int i = 1; i <= N; i++)
            System.out.print("B");
        System.out.print("C");
        System.out.print("D");
        scanf.close();
    }
}