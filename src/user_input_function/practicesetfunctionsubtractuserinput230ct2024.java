package user_input_function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class practicesetfunctionsubtractuserinput230ct2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number = ");
        int num1 = sc.nextInt();
        System.out.println("enter second number = ");
        int num2 = sc.nextInt();
        int sub=subtract(num1,num2);
        System.out.println(sub);
    }
    static int subtract(int num1,int num2){
        return num1-num2;
    }
}
