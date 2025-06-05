package June.ex_02062025;

public class Lab042_GradeCalculator_Ex {
    public static void main(String[] args) {
        //✅Grade Calculator
        // Write a program that calculates and displays the letter garde for a given numerical
        // score (e.g. A, B, C, D, or F)
        // based on the following grading scale:
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // E: 0-59

        // 90 -> A
        // 87 -> B
        // 23 -> F

        // 1. Find the user Inputs
        // score --> int score = 89
        // return --> data -- type -- grade --> char

        // 2. Basic Logic
        // if (score >= 90 && score <= 100) -> return or print grade - A
        // else if (score <= 89 && score >= 80) -> return or print grade - B
        // else if (score <= 79 && score >= 70) -> return or print grade - C
        // else if (score <= 69 && score >= 60) -> return or print grade - D
        // else if (score <= 0 && score >= 59) -> return or print grade - E
        // else --> grade -> 'F'

        // 3. Write the Code
        char grade = 'F';
        int score = 30; // in the future we will get this from teh user input from the "Scanner"

        if(score >=90 && score <=100){
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        }else if (score <= 0 || score > 100) {
            System.out.println("LOL!, are you God?");
            grade = 'O';
        }else {
            grade = 'F';
        }
        System.out.println("Your Grade is ->"+ grade);

    }

}

