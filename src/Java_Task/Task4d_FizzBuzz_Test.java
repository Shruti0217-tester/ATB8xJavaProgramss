package Java_Task;

public class Task4d_FizzBuzz_Test {
    public static void main(String[] args) {
        // Write a Program that prints from 1 to 100.
        // For multiples of 3. print "Fizz".
        // For multiples of 5, print "Buzz".
        // For both the multiples 3 and 5, print "FizzBuzz".

         for (int a = 1 ; a <= 100 ; a++){
             if(a % 3 == 0 && a % 5 == 0){
                 System.out.println("Multiple of Both 3 and 5 'FizzBuzz'" +a);
             } else if (a % 3 == 0){
                 System.out.println("Multiple of 3 'Fizz'" +a);
             } else if (a % 5 == 0){
                 System.out.println("Multiple of 5 'Buzz'" +a);
             }else{
                 System.out.println("Multiple of Nothing" +a);
             }
         }



    }
}
