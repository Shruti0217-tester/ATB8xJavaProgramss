package Java_Task;

public class Task3a_TypeCasting {
    public static void main(String[] args) {
        // TypeCasting
        // 1. Widening
        short rollno = 1000;
        int number = rollno; // Implicit
        int number1 = (int)rollno; // Explicit

        // 2. Narrowing
        float percentage = 87.56f;
      //  int roundoff = percentage; // Implicit
        int roundeoff = (int)percentage; // Explicit

    }
}
