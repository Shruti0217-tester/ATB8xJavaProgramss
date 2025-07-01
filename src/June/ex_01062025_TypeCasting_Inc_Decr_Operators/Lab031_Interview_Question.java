package June.ex_01062025_TypeCasting_Inc_Decr_Operators;

public class Lab031_Interview_Question {
    public static void main(String[] args) {
        byte a1 = 10;
        // byte - 1 Byte
        // bits - 8 bits

        long l = 10l;
        // 8 bytes and 64 bits

        String s = "name";
        // 8 byte and 64 bits

        // Interview Question 1

        byte a = 10;
        byte b = 10;
        int c = a + b;
        System.out.println(c);

        char a2 ='A'; // 65
        System.out.println(a2);
        char b2 ='B'; // 66
        int c1 = a2 + b2;
        System.out.println(c); // 131

        // Interview Question 2

        System.out.println('A' == 65); // ASCII
        System.out.println('B' == 66); // ASCII

        // Interview Question 3

        short s3 = 10;
        char c3 = 'A'; // ASCII value is 65
        int result = s3 + c3;
        System.out.println(result);

    }
}
