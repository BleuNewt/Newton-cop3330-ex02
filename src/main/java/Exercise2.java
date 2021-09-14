/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Newton
 */
import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("What is the input string?");
        str = scan.next();
        str.length();

        int Length = str.length();
        
        System.out.print(str);
        System.out.print(" ");
        System.out.print("has");
        System.out.print(" ");
        System.out.print(+Length);
        System.out.print(" ");
        System.out.print("characters");

    }
}