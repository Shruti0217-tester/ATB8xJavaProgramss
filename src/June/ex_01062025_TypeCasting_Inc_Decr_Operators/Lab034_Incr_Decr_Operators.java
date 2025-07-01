package June.ex_01062025_TypeCasting_Inc_Decr_Operators;

public class Lab034_Incr_Decr_Operators {
    public static void main(String[] args) {

        // Increment (++) / Decrement (--) Operators
        // Pre and Post

        // Pre-Increment ---> ++Operand
        // value is incremented first and then stored in the result.
        int a = 10;
        int b = ++a; // a = a+1
        // | a | output (b)|
        // 10
        // 11 | 11
        System.out.println(b);
        System.out.println(a);

        int a1 = 10;
        System.out.println(++a1);
        System.out.println(a1);


        // Post - Increment ---> Operand++
        // Print first and then increase the value.
        int a2 = 15;
        System.out.println(a2++);
        System.out.println(a2);
    }
}
