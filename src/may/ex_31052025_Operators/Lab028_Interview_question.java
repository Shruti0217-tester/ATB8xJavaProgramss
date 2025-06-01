package may.ex_31052025_Operators;

import java.sql.SQLOutput;

public class Lab028_Interview_question {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);
        System.out.println(!(10>20));
        System.out.println(!!!!(30>90));
      //  System.out.println((30>90)!);  // ERROR...

      // Logical Operators || ---- OR

        // System.out.println(true || true);
        // System.out.println(true || false);
        // System.out.println(false || true);
        // System.out.println(false || false);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
