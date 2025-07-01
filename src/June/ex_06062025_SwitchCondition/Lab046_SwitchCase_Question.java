package June.ex_06062025_SwitchCondition;

public class Lab046_SwitchCase_Question {
    public static void main(String[] args) {
        int itemCode = 001;

        // '->' It works as break.
        switch (itemCode){
            case 001 -> System.out.println("Its a Laptop!");
            case 002 -> System.out.println("It's a Desktop!");
            case 003, 004-> System.out.println("It's a Mobile Phone!");
            default -> System.out.println("Hellloooo!");



        }
    }
}
