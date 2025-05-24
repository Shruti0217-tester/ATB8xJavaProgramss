package may.ex_24052025;

public class lab015_StringFormatting_Ex {
    public static void main(String[] args) {
        // String Formatting
        // Problem Statement -> print table of 9
        System.out.println("9*1=9");
        System.out.println("9*2=18");
        System.out.println("9*3=27");

        int num = 17;
        // %d -> nat integer, byte, short, long
        // %s -> string
        // %c -> char
        // %f -> float, double
        System.out.printf("Value of %d",num);
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.printf("%d * %d = %d",num,2,num*2);
        System.out.printf("%d * %d = %d",num,3,num*3);
        System.out.printf("%d * %d = %d",num,4,num*4);
        System.out.printf("%d * %d = %d",num,5,num*5);
    }
}
