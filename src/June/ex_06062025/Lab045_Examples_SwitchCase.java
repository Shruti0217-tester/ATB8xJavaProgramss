package June.ex_06062025;

public class Lab045_Examples_SwitchCase {
    public static void main(String[] args) {
        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
  //          case 98:
  //              System.out.println("98");
        }

        // JDK > 13
        int itemcode = 003;
        switch (itemcode){
            case 001, 002, 005:
                System.out.println("All of them are Electronic Gadgets");
            break;
            case 004, 006, 007:
                System.out.println("This is Mechanical");
            break;
            default:
                System.out.println("None of them");
        }
    }
}
