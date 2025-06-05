package June.ex_02062025;

public class Lab041_Ex_If_Else {
    public static void main(String[] args) {
        // Example --> 1
        int a = 10;
        if (a == 4) {
            System.out.println("HAHAHAHA");
        } else {
            System.out.println("Bye");
        }

        // Example --> 2
        boolean b = !true;
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is not true");
        }

        // Example --> 3
        boolean c = true;
        c = !c;
        if (2 + 2 < 4) {
            System.out.println("Inside the loop");
        }
        System.out.println("Outside ->" + c);
        // Understand with debug -> checking the code line by line

        // Example --> 4
        int num = 11;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Example --> 5
        int num1 = 30;
        int num2 = 30;
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Equal");
        }
    }
}