package June.ex_12062025_Loops;

public class Lab053_Ex_ForLoops {
    public static void main(String[] args) {
        for (char c = 'a'; c<= 'z'; c++){
            System.out.println(c);
        }

        // Example 2

        for (int i = 0; i > 0; i--){ // No Output --> 0>0 --> False
            System.out.println(i);
        }

        // Example 3

        int i = 10; // In this program initialization is done outside the Loop.
        for (; i > 0; i--){
            System.out.println(i);
        }

        // Example 4

        for (int a = 0; a < 10; a++){
            System.out.println("Hii Shruti!");
        }
        System.out.println("OutSide Loop");

        // Example 5

        for (int b = 0; b < 10; b++){  // 0 to 9 -> 10 times will print
            System.out.println("Shruti Singh");
        }


    }
}
