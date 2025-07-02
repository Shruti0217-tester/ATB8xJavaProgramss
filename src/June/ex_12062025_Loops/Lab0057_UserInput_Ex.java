package June.ex_12062025_Loops;

import java.util.Scanner;

public class Lab0057_UserInput_Ex {
    public static void main(String[] args) {
        // How to take a user input

        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter your name:");

        String name = sc.next();
        System.out.println(name);
    }
}
