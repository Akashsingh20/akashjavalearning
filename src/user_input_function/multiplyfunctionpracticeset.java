package user_input_function;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class multiplyfunctionpracticeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        System.out.println("enter your number2");
        int b = sc.nextInt();
        int multi= mul_result(a,b);
        System.out.println(multi);

    }
static int mul_result(int a, int b){
        return a*b;
    }
}
