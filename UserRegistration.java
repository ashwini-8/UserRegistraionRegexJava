package com.project.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String  FIRSTNAME = "^[A-Z]{1}[a-z]{2,}$";
    public static void main(String[]args)
    {
        System.out.println("User Registration regex");
        System.out.println("Enter your first name");
        Scanner input=new Scanner(System.in);
        String firstName=input.next();
        firstNameRegex(firstName);
    }

    public static void firstNameRegex(String firstName){
        boolean Result = firstName.matches(FIRSTNAME);
        System.out.println("\nResult " + Result + "First Name: " + firstName );
    }


  }

