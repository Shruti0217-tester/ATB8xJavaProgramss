package June.ex_12062025_Loops;

public class Lab051_Ex_For_Loop {
    public static void main(String[] args) {
        for (int i = 0; i > 1; i++){ // This program will never run -> 0>1 --> False
            System.out.println(i);
        }

        for (int i = 0; ; i++){ // This Program will go in Infinite Loop -> No Condition is given
            System.out.println(i); // To Stop the Loop Exit Code 130 -> Stop by Keyboard
        }


    }
}
