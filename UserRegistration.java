package com.project.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String  FIRSTNAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String  LASTNAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String  EMAIL =  "^[A-Za-z0-9+_.-]+@(.+)$";
    static Scanner input=new Scanner(System.in);

    public static void main(String[]args)
    {
        chooseOption();
    }
    public static void chooseOption(){
        System.out.println("Options are: \n 1.First-Name    2.Last-Name     3.Email-id");
        System.out.println("Enter option to check Regex Pattern");
        int inputOption = input.nextInt();
         switch (inputOption){
             case 1 : System.out.println("Enter your first name");
                      String firstName=input.next();
                      firstNameRegex(firstName);
                      break;
             case 2 : System.out.println("Enter your Last name");
                 String lastName=input.next();
                 lastNameRegex(lastName);
                 break;
             case 3 : System.out.println("Enter your Email-id");
                 String Email=input.next();
                 emailIdRegex(Email);
                 break;
             default:
                 System.out.println("Enter a valid Option");
         }
    }
    public static void firstNameRegex(String firstName){
        boolean Result = firstName.matches(FIRSTNAME);
        System.out.println("\nResult " + Result + "\nFirst Name: " + firstName );
    }
    public static void lastNameRegex(String lastName){
        boolean Result = lastName.matches(LASTNAME);
        System.out.println("\nResult " + Result + "\nLast Name: " + lastName );
    }
    public static void emailIdRegex(String email){
        boolean Result = email.matches(EMAIL);
        System.out.println("\nResult " + Result + "\nEmail: " + email );
    }
}

