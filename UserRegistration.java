package com.project.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String  FIRSTNAME = "^[A-Z]{1}[a-z]{2,}$";
    static Scanner input=new Scanner(System.in);

    public static void main(String[]args)
    {
        chooseOption();
    }
    public static void chooseOption(){
        System.out.println("1.FirstName");
        System.out.println("Enter option to check");

         int inputOption = input.nextInt();
         switch (inputOption){
             case 1 : System.out.println("Enter your first name");
                      String firstName=input.next();
                      firstNameRegex(firstName);
             break;
             default:
                 System.out.println("Enter a valid Option");
         }
    }
    public static void firstNameRegex(String firstName){
        boolean Result = firstName.matches(FIRSTNAME);
        System.out.println("\nResult " + Result + "\nFirst Name: " + firstName );
    }
}

