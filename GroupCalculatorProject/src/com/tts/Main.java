package com.tts;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double num1;
        double num2;
        double ans;
        char op;
        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers but leave a space in between" + ": ");
        //String someString = scanner.next();
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /, R, S, C, T): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            case 'R':
                ans = Math.sqrt(num1);
                break;


            //for(i=1; i<=number; i++) {
                //switch (op) {


            case 'S':
                ans = Math.sin(Math.toRadians(num1));
                break;
            case 'C':
                ans = Math.cos(Math.toRadians(num1));
                break;
            case 'T':
                ans = Math.tan(Math.toRadians(num1));
                break;


            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}












        //Functions calcFunctions = new Functions();










