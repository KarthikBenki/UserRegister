package com.register;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegister {
    static Scanner sc = new Scanner(System.in);

    /*
       @purpose: Ability to add first name
       @param: No parameters
       @function : FirstName Validation
       @return: No return value.
      */
    public static void firstName() {
        System.out.println("Enter First Name");
        String fN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }

    /*
       @purpose: Ability to add last name
       @param: No parameters
       @function : last Validation
       @return: No return value.
      */
    public static void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Last Name");
        String lN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
    }
    public static void main(String[] args) {
        firstName();
        lastName();
    }
}
