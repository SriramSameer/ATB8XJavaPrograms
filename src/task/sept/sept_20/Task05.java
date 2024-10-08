package task.sept.sept_20;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
Leap Year Program - Find 2024
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 !=0) | year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
