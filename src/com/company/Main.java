package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("This is a very bad calculator");
        Scanner opperation  = new Scanner(System.in);
        System.out.print("Would you like to multiply, divide, add, or subtract");
        String calc = opperation.nextLine();
        System.out.print("Now for your numbers");




        //Number imputs
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your first number");
        int num1 = number.nextInt();
        int fNum = num1;
        Scanner number2 = new Scanner(System.in);
        System.out.print("Enter your second number");
        int num2 = number2.nextInt();
        int sNum = num2;

    }
}
