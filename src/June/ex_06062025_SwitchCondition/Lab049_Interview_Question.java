package June.ex_06062025_SwitchCondition;

public class Lab049_Interview_Question {
    public static void main(String[] args) {
        // Char c ='a' -> Vowel or consonant
        // vowel -> a,e,i,o, u
        char ch = 'u';
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
