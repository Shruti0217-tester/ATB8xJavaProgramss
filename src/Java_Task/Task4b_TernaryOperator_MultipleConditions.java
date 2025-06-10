package Java_Task;

public class Task4b_TernaryOperator_MultipleConditions {
    public static void main(String[] args) {
        // Ternary Operator to handle multiple conditions

        // Syntax:- condition ? expression_if_true : expression_if_false

        // int score  = 85
        // String grade ->
        // score >= 90 -> A
        // score >= 80 -> B
        // score >= 70 -> C

        int score = 25;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        System.out.println(grade);

    }
}
