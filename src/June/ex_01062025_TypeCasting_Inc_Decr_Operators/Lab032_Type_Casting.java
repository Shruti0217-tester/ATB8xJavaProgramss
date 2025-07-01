package June.ex_01062025_TypeCasting_Inc_Decr_Operators;

public class Lab032_Type_Casting {
    public static void main(String[] args) {
        // Type Casting
        // Widening --> Implicit, Explicit -- lossless
        // Narrowing --> Implicit, Explicit -- lossless

        // Widening
        byte b = 10;
        int a = b; // Valid - Implicit Casting -- JVM does it.
        int a1 = (int)b; // Valid - Explicit Casting -- JVM does it.

        // Narrowing
        int val = 300;
        // byte b1 = val; // Invalid Implicit Casting - JVM
        byte b2 = (byte)val; // Invalid Explicit Casting - Loss of data
        System.out.println(b2);
        // Explaination ----> int a = 300; --> int means 32bit memory required
        // 0000000000000000000000100101100
        // byte b1 = (byte)a; --> byte means 8bit memory required
        // 00101100
        // Value is --> 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44
    }
}
