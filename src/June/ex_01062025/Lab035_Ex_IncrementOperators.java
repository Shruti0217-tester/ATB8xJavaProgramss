package June.ex_01062025;

public class Lab035_Ex_IncrementOperators {
    public static void main(String[] args) {
        // Pre - Increment
        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Line no. | Exp | a
        // 5        |     | 10
        // 6        | result = 11 | 11
        // 7        | result = 11 | 11

        // Post Increment
        int a1 = 10;
        int result1 = a1++;
        System.out.println(a1);
        System.out.println(result1);

        // Line no. | Exp | a1
        // 16       |     | 10
        // 17       | result1 = 10 | 11
        // 18       | result1 = 10 | 11

    }
}
