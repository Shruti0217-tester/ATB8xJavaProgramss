package may.ex_31052025_Operators;

public class Lab023_Ex_ConcatenationOperator {
    public static void main(String[] args) {
        String first_name = "Shruti";
        String last_name = "Singh";
        System.out.println(first_name + last_name);
        // Concatenation Operator '+'
        // + -> int + int -> math
        // + -> String + String -> Combine -> Concatenate
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        System.out.println(first_name + last_name + (a + b));

        System.out.println(a + b + first_name + last_name);
    }
}
