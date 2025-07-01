package June.ex_12062025_Loops;

public class Lab055_RealTime_Example {
    public static void main(String[] args) {
        // print the values of Even and Odd numbers from 0 to 50

        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                System.out.println("Even Number: " + i);
                continue;
            }
            System.out.println("Odd Number: " + i);
        }

        // Example 2 --> printing the Alphabets from A to Z

        for (char c = 'A'; c <= 'Z'; c++){
            System.out.println(c);
        }
    }
}
