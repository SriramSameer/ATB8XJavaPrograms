package task.sept.sept_25;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
//        Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
//
//        // n = 1 ->  Fact = 1*1 -> 1
//
//        // n = 3 -> Fact = 3*2*1 -> 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int factorial =1;
        for (int i=1;i<=n;i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
