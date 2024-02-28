package lab_assignment_1;

import java.util.Scanner;

public class WordTower{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of 'B' blocks required : ");
        int N=sc.nextInt();
        if(!(1<=N && N<=2024)){
            System.out.println("Invalid Input");
        }else{
            System.out.println("A");
            for(int i=0;i<=N;i++){
                System.out.println("B");
            }
            System.out.println("C");
            System.out.println("D");
        }    }   
}


/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of 'B' blocks (N): ");
    int N = sc.nextInt();
    if (!(1 <= N && N <= 2024)) {
        System.out.println("Invalid input. N should be a positive integer between 1 and 2024.");
    } else {
        StringBuilder wordTowerSequence = new StringBuilder();
        wordTowerSequence.append('A');
        for (int i = 0; i < N; i++) {
            wordTowerSequence.append('B');
        }
        wordTowerSequence.append('C');
        wordTowerSequence.append('D');

        // Convert StringBuilder to String and display the constructed Word Tower
        String wordTower = wordTowerSequence.toString();
        System.out.println("Word Tower of height " + N + ": " + wordTower);
    }

    // Close the scanner
    sc.close();
}*/