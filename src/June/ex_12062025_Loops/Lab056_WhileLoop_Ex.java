package June.ex_12062025_Loops;

public class Lab056_WhileLoop_Ex {
    public static void main(String[] args) {
        // While Loop Example
        // While --> A, B, C
        //           // A-> Init
        //           // B-> Condition
        //           // C-> Increment/ Decrement

        int i = 0; // A
        while (i <=10) { // B
            System.out.println(i);
            i++; // C
        }

        // Comparison with For Loop
        for (int j = 0; j <= 10; j++){
            System.out.println(j);
        }

        // Example Real Time --> Print Modi do the work for <=15

        int modi = 0;
        while (modi <= 15) {
            System.out.println("Modi do your work!");
            modi++;
        }

        // Example 4 --> Print 10 to 1 in from while loop

        int i1 = 10;
        while (i1 >= 1) {
            System.out.println(i1);
            i1--;
        }
    }
}
