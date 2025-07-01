package June.ex_12062025_Loops;

public class Lab052_Ex_of_InfiniteLoop {
    public static void main(String[] args) {

        // Example 1

        final boolean b1 = true;
        // b1 = false; // Final this is fixed now

        for (int i = 0; b1; i++){ // This program will go to infinite loop because b1= True
           System.out.println("Hello");
        }
    }
}
