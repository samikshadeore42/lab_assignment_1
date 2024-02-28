 package lab_assignment_1;
// import java.util.*;

// public class q2{
//     public static void main(String args[]){
//         Scanner scanf=new Scanner(System.in);
//         int n=scanf.nextInt();
//         for(int i=0;i<n;i++){
//             System.out.print(n);
//         scanf.close();
//         }
//     }
// }

 class Cat{
    public void m1(){
        System.out.print("cat 1 ");
    }
    public void m2(){
        System.out.print("cat 2 ");
    }
}
    class Dog extends Cat{
    public void m1(){
        m2();
        System.out.print("dog 1 ");
    }
}
 class Lion extends Dog {
    public void m2(){
        System.out.print("lion 2 ");
    }
} 

    
 class Test{
    public static void main(String[] args){
        Cat[] elements={new Dog(),new Cat(),new Lion()};
        for(int i=0;i<elements.length;i++){
            elements[i].m1();
            System.out.println();
            elements[i].m2();
            System.out.println();
            System.out.println();
        }
    }
}

// public class Main {
//     public static void main(String... args){
//         System.out.println("BUILD AN ANIMAL :");
//         Animal animal=new Animal();
//         System.out.println(" ");
//         System.out.println("BUILD A FISH : ");
//         Animal fish=new Fish();
    
//     }

//     private static class Animal{
//         Animal(){
//             System.out.println("Animal Constructer");
//             perform();
//         }
//         void perform(){
//             System.out.println("Animal perform.");
//         }
//     }

//     private static class Fish extends Animal {
//         Fish(){
//             super();
//             this.tailShape="TAil shape is triangle";
//             System.out.println("Fish Constructoe.");
//             perform();
//         }
//         void perform(){
//             System.out.println("Fish perform.Tail shape is : "+tailShape);
//         }
//         private String tailShape;
    
        
//     }

    
// }