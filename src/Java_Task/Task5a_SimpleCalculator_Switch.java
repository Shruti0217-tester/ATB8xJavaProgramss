package Java_Task;

public class Task5a_SimpleCalculator_Switch {
    public static void main(String[] args) {
        // Create a Simple Calculator using Switch Condition
        // That performs Addition, Subtraction, Multiplication and Division based on user inputs.

        int a = 79;
        int b = 95;
        int c;
        char ch = 1;

        switch (ch)
        {
            case 1:
                c = a + b;
                System.out.println("Addition of two numbers is " +c);
                break;
            case 2:
                c = a - b;
                System.out.println("Subtraction of two numbers is " +c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication of two numbers is " +c);
                break;
            case 4:
                c = a / b;
                System.out.println("Division of two numbers is " +c);
                break;
            case 5:
                c = a % b;
                System.out.println("Modulus of two numbers is " +c);
                break;
            default:
                System.out.println("Simple Calculator program is completed");
        }
    }
}
