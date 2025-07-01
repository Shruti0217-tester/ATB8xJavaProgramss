package June.ex_12062025_Loops;

public class Lab054_LoopsAndCondition_Ex {
    public static void main(String[] args) {
        // Loops and Condition

        // Example 1

        for (int i = 1; i <= 10; i++) {
            if (i == 5){
                System.out.println("Five");
            }else{
                System.out.println(i);
            }
        }

        // Example 2 --> Print all the Even Numbers from 0 to 50

        for (int a = 0; a <= 50;a++) {
            if (a % 2 == 0){
                System.out.println(a);
            }
        }

        // Example 3 --> Break keyword program

        for (int b = 0; b < 50; b++) {
            System.out.println(b);
            if(b == 5){
                break;
            }
        }

        // Example 4 --> Continue keyword program

        for (int c = 0; c < 10; c++) {  // 0 to 9
            System.out.println(c);
            if (c == 2){
                continue;
            }
            System.out.println("After");
        }
    }
}
