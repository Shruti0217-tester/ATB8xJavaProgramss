package June.ex_01062025;

public class Lab033_Ex_TypeCasting {
    public static void main(String[] args) {
        // Example 1

        long phone_no = 8768698698l;
        // short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s = (short)phone_no; // Narrowing - Explicit - Loss // Invalid

        // Example 2

        // GST = 18,45;
        int course = 100;
        float GST = 18.45f;
        // int total_price = course+GST; // Narrowing - Implicit - JVM - Invalid
        // float total_price = course+GST; // Widening
        // - Implicit - JVM - Invalid

        int total_price = course+(int)GST; // Narrowing - Explicit - LOSS
        System.out.println(total_price);
    }
}
