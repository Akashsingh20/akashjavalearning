import jdk.dynalink.beans.StaticClass;

import java.lang.invoke.StringConcatFactory;
import java.sql.SQLOutput;

public class functions {
    public static void main(String[] args) {
//        System.out.println("Hi how are you ");
//        int result = Math.max(10, 18); // built in function max. Interally it is using ternary
//        System.out.println(result);
        //
        akash(); // 1. No parameter no return type function

        String Akash = Greet_akash(); // without parameter and with return type
        System.out.println(Akash);

        int add_numbers = add_two_numbers(3, 4);  // with parameter with return
        System.out.println(add_numbers);

        String variablename = akash_1(); //without parameter and with return
        System.out.println(variablename);

        int a = akash_2();
        System.out.println(a);

        akash4("Akash","singh");

    }

    static void akash() { // 1. No parameter no return type function
        System.out.println("my name is Akash Singh");
    }

    static String Greet_akash() { // without parameter and with return type
        System.out.println("greet akash singh");
        return "Awesome Akash";

    }

    static int add_two_numbers(int a, int b) { // with parameter with return
        return a + b;
    }

    static String akash_1() { //without parameter and with return
        System.out.println("without parameter and with return");
        return "Akash Singh sln";
    }

    static int akash_2() {
        System.out.println("without parameter and with return");// int type without parameter and with return
        return 27;
    }
    static void akash4(String firstname, String lastname){
        System.out.println(firstname + " " +lastname);

    }
}