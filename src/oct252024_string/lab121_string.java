package oct252024_string;

import java.sql.SQLOutput;

public class lab121_string {
    public static void main(String[] args) {
        String S1 = "Akash";
        String S4 = "Akash";
        String S5 = new String("Akash");
        String S6 = new String("Akash");


        // 1 in SCP and , 2 in OA
        // == -> use for comparision
        System.out.println(S1==S5);
        System.out.println(S1==S4);
        System.out.println(S5==S6);

        // equal(content) -> value
// equals always check the content
        System.out.println(S1.equals(S6));
        System.out.println(S5.equals(S6));
        System.out.println(S5.equalsIgnoreCase(S6));
    }
}
