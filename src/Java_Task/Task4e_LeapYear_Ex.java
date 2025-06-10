package Java_Task;

import java.util.Scanner;

public class Task4e_LeapYear_Ex {
    public static void main(String[] args) {
        // Leap Year programming using hardcoded value in Year

        int year1 = 1987;
        if (year1 % 4 == 0 || year1 % 100 != 0 && year1 % 400 == 0){
            System.out.println("This is a Leap Year:" +year1);
        }else {
            System.out.println("It is not a Leap Year:" +year1);
        }

        System.out.println();

        // Leap Year Programming using Scanner

        System.out.println("Enter your Leap Year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0){
            System.out.println("This is a Leap Year:" +year);
        }else {
            System.out.println("It is not a Leap Year:" +year);
        }
    }
}
