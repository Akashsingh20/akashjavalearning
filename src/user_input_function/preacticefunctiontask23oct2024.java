package user_input_function;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class preacticefunctiontask23oct2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int sum = add(num1,num2);
        System.out.println(sum);
    }
     static int add(int num1, int num2){
        return num1+num2;
     }
}
