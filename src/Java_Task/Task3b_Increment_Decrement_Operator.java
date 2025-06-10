package Java_Task;

public class Task3b_Increment_Decrement_Operator {
    public static void main(String[] args) {
        // Increment/ Decrement Operator

        int a = 10;
        System.out.println(--a + a-- + a--); // (--10 + 9-- + 8--) = (9 + 9 + 8) =26
        System.out.println(a); // a = 7

        int b = 10;
        System.out.println(--b + b++ + b--); // (--10 + 9++ + 10--) = (9 + 9 + 10) =28
        System.out.println(b); // b = 9

        int c = 10;
        System.out.println(c-- + c-- + c--); // (10-- + 9-- + 8--) = (10 + 9 + 8) =27
        System.out.println(c); // c = 7
    }
}
