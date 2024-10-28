package user_input_function;

import java.util.Scanner;

public class divisionfunctionpracticeset23oct2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        System.out.println("enter your number");
        int b = sc.nextInt();
        int  div= division_function(a,b);
        System.out.println(div);

    }
    static int division_function (int a, int b){
        return a/b;
    }
}


