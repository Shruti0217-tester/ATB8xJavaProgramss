package Java_Task;

public class Task2_01062025 {
    public static void main(String[] args) {
        // Q.1 ---> Difference between "=" and "==" ?
        // Ans ---> "=" it is the assignment operator. Used to assign the value.
        // Ans ---> "==" is teh relational Operator. USed as Equal to.
        // Q.2 ---> byte b = 10; long l = 10l; -> How much Byte will bw used?
        // Ans ---> In byte b = 10; ---- here byte b has 1 Byte.
        // Ans ---> In long l = 10l; ---- here long l has 8 Byte.
        // Ans ---> So all total we have = 9 Byte
        // Q.3 ---> Another byte b = 10; byte c = 10; What is the answer if we perform b+c, what is the data type it will give in result.
        byte b = 10;
        byte c = 10;
        System.out.println(b+c); // b+c = 20
        // the data type of result is (20) numeric.
        // Q.4 --->
        short s = 10;
        char c1 = 'A'; // 65 ---> ASCII Value
        int ss = s+c1;
        System.out.println(ss); // result (ss) = 75

    }

}
