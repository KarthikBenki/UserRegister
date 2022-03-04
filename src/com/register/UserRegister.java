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

    /*
       @purpose: Ability to add email
       @param: No parameters
       @function : email Validation
       @return: No return value.
      */
    public static void email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter EMail");
        String email = sc.nextLine();
        if (Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$", email) == true)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
    /*
       @purpose: Ability to add mobile
       @param: No parameters
       @function : mobile Validation
       @return: No return value.
      */
    // UC4 - Mobile Format
    public static void mobile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Mobile Number With Country Code(space between code and number)");
        String m = sc.nextLine();
        if (Pattern.matches("^[1-9]{2}\s{1}[1-9]{1}[0-9]{9}$", m) == true)
            System.out.println("Valid Mobile");
        else
            System.out.println("Invalid Mobile");
    }
    /*
       @purpose: Ability to add password
       @param: No parameters
       @function : password Validation
       @return: No return value.
      */
    // Rule2 Should have atleast 1 numeric character
    public static void password() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("\nEnter the Password");
        String p = sc.nextLine();
        if (Pattern.matches("^(?=.*[0-9])\"+\"(?=.*[a-z])\"+\"(?=.*[A-Z])\"+\"(?=.*[@#$%^&+=]){8,}$", p) == true)//should have one upper case
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    public static void main(String[] args) {
        firstName();
        lastName();
        email();
        mobile();
        password();
    }
}
