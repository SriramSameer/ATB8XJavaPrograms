package task.sept_27;

public class Task03 {
    public static void main(String[] args) {
//        Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
