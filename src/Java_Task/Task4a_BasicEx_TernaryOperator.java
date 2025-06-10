package Java_Task;

public class Task4a_BasicEx_TernaryOperator {
    public static void main(String[] args) {

        // Syntax:- condition ? expression_if_true : expression_if_false

        int a = 10;
        int b = 20;
        int c = 30;

        int min = (a>b && a>c) ? b : a;
        int max = (a<b && a<c) ? c : b;

        System.out.println("minimum no. is ->" + min);
        System.out.println("maximum no. is ->" + max);
    }

}
