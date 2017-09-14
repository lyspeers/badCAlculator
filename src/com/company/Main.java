package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is a very bad calculator");
        Scanner opperation  = new Scanner(System.in);
        System.out.println("Would you like to multiply, divide, add, or subtract");
        String calc = opperation.nextLine();
        double opp = Math.random();

        //Number imputs
        System.out.println("Now for your numbers");
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = number.nextInt();
        int fNum = num1;
        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter your second number");
        int num2 = number2.nextInt();
        int sNum = num2;

        //bad calculating part
        if(opp<=.025){
            double finalNum = Math.sqrt(fNum + sNum);
            System.out.println(finalNum);
        }else if(opp<=.50){
            double finalNum = Math.pow(fNum, sNum);
            System.out.println(finalNum);
        }else if(opp<=.75){
            double finalNum = Math.log(fNum + sNum);
            System.out.println(finalNum);
        }else{
            double finalNum = fNum + sNum+5;
            System.out.println(finalNum);
        }
//guessing what operation the calculator performed instead
        Scanner question  = new Scanner(System.in);
        System.out.print("What operation did the calculator perform: Square root, Exponent, Logarithm or did it add 5?");
        String guess = question.nextLine();
        guess = guess.toLowerCase();
        if(opp<=.025 && guess.equals("square root")){
            System.out.println("You got it");
        }else if(opp<=.50 && guess.equals("exponent")){//can think of a better name for the operation
            System.out.println("You got it");
        }else if(opp<=.75 && guess.equals("logarithm")){
            System.out.println("You got it");
        }else if(opp<1 && guess.equals("add 5")){
            System.out.println("You got it");
        }else{
            System.out.println("Oops wrong answer");
        }
    }
}
