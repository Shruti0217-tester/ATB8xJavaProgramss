package June.ex_01062025;

import javax.xml.transform.Source;

public class Lab036_Ex2_IncrementOperator {
    public static void main(String[] args) {

        // Example 1
        int a = 10;
        System.out.println(a++ + a);
        // Line no. | b | Exp
        // 9 | 10 | NA
        // 10 | 10 | 11 + b(which is 10) ---> 11 + 10 = 21

        System.out.println();

        // Example 2
        int b = 10;
        System.out.println(b++ + ++b);
        System.out.println(b);
        // A -> b++ --> 10, A = 11 ---> Post Increment
        // + --> Operator
        // B -> ++b --> B = 11 --> b = 12 ---> Pre Increment

        // Line no. | b | Exp
        // 18 | 10 | NA
        // 19 | 12 | 10 + 12

        System.out.println();

        // Interview Question 1
        int c = 10;
        System.out.println(++c + ++c);
        System.out.println(c);

        // A -> ++c --> 11, A = 11 ---> Post Increment
        // + --> Operator
        // B -> ++c --> B = 12 --> B = 12 ---> Pre Increment

        // Line no. | c | Exp
        // 32 | 10 | NA
        // 33 | 12 | 11 + 12 = 23

        System.out.println();

        // Interview Question 2
        int d = 10;
        System.out.println(++d + d++ + d++);
        System.out.println(d);

        // A -> ++d --> 11, A = 11 ---> Pre Increment
        // + --> Operator
        // B -> d++ --> B = 11 --> B = 12 ---> Post Increment
        // + --> Operator
        // c -> d++ --> C = 12 --> C = 12 ---> Post Increment

        // Line no. | c | Exp
        // 47 | 10 | NA
        // 48 | 12 | 11 + 11 + 12 = 34

    }
}
