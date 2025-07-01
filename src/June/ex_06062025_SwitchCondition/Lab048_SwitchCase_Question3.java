package June.ex_06062025_SwitchCondition;

public class Lab048_SwitchCase_Question3 {
    public static void main(String[] args) {
        char code ='C';
        switch (code){
            default:
                System.out.println("Helllooooooooo");
                break;

            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }

        // Concatenation Example

        char c ='C';
        switch (c){

            default:
                System.out.println("Helllooooooooo");
                break;
            case 'A'+1:
                System.out.println("65");
                break;
            case 'A'+2:
                System.out.println("66");
                break;
    }
}
}
