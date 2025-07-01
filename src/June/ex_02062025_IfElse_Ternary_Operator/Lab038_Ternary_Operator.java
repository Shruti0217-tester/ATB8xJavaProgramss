package June.ex_02062025_IfElse_Ternary_Operator;

public class Lab038_Ternary_Operator {
    public static void main(String[] args) {
        // The ternary Operator is a concise way to perform conditional evaluations in programming, often serving as a shorthand for if-else statements.
        // age > 18 --> vote india -> true
        // age < 18 --> not allowed to vote.
        // Condition: anything which has some output.
        // Syntax:- condition ? expression_if_true : expression_if_false
        int a1 = (30 > 40) ? 10 : 20;
        System.out.println(a1);

        // Example Question 1
        int shruti = 4;
        int mansi = 3;
        String result = shruti > mansi ? "Shruti Won" : "Mansi Won";
        System.out.println(result);

        // Example Question 2
        String str = 10 > 20 ? "10" : "Twenty";
        System.out.println(str);

        // Interview Question
        // max, min between two numbers.
        int tushar = 4;
        int prabhu = 7;
        // max
        // min
        int max = tushar > prabhu ? tushar : prabhu;
        System.out.println(max);

        int min = tushar > prabhu ? prabhu : tushar;
        System.out.println(min);

    }
}