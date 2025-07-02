package Java_Task;

public class Task5c_Kmtom_ftoc_SwitchCondition {
    public static void main(String[] args) {
        /* Write a program that convert between different units (e.g. kilometers to miles, celsius to
         fahrenite) based on the user's choice using a switch statement.
         */
        int km = 1;
        int meter;
        double fahrenheit;
        float celsius = 5;
        char ch = 2;
        switch (ch)
        {
            case 1:
                meter = km *1000;
                System.out.println("Kilometer to meter is:" +meter);
                break;
            case 2:
                fahrenheit = (9.0 / 5.0) * celsius + 32;
                System.out.println(fahrenheit);
                break;
        }
    }
}
