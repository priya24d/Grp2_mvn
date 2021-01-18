package com.knoldus;

import java.util.*;

public class Application {
        public static void main(String[] args) {
           // System.out.println("Hello");
            StringFunction r = new StringFunction();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string : ");
            String s = sc.nextLine();
            System.out.println("Reversed String: " + r.rev(s));
            System.out.println("The length of the String \""+s+"\" is: " +s.length());
        }
    }

