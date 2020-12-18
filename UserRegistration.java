package com.project.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String  FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String  LAST_NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String  EMAIL =  "^[0-9a-zA-Z]+([.-_+][0-9a-zA-Z]+)@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";
    private static final String  PHONE_NUMBER = "^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$";
    private static final String  PASSWORD ="(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1,}).{8,}";
    static Scanner input=new Scanner(System.in);

    public static void main(String[]args)
    {
        while(true)
            chooseOption();
    }
    public static void chooseOption(){
        System.out.println("Options are: \n 1.First-Name    2.Last-Name    3.Email-id    4.Phonenumber      5.Password");
        System.out.println("Enter option to check Regex Pattern");
        int inputOption = input.nextInt();
         switch (inputOption){
             case 1 : System.out.println("Enter your first name");
                      String firstName=input.next();
                      firstNameRegex(firstName);
             case 2 : System.out.println("Enter your Last name");
                     String lastName=input.next();
                     lastNameRegex(lastName);
             case 3 : System.out.println("Enter your Email-id");
                     String Email=input.next();
                     emailIdRegex(Email);
             case 4 : System.out.println("Enter your Phone Number");
                      String phoneNumber=input.next();
                      PhonenumberRegex(phoneNumber);
             case 5 : System.out.println("Enter your Password");
                      String password=input.next();
                      PasswordRegex(password);
             default:
                     System.out.println("\nEnter a valid Option");
                     break;
         }
    }
    public static void firstNameRegex(String firstName){
        boolean Result = firstName.matches(FIRST_NAME);
        System.out.println("\nResult " + Result + "\nFirst Name: " + firstName );
    }
    public static void lastNameRegex(String lastName){
        boolean Result = lastName.matches(LAST_NAME);
        System.out.println("\nResult " + Result + "\nLast Name: " + lastName );
    }
    public static void emailIdRegex(String email){
        boolean Result = email.matches(EMAIL);
        System.out.println("\nResult " + Result + "\nEmail: " + email );
    }
    public static void PhonenumberRegex(String phoneNumber){
        boolean Result = phoneNumber.matches(PHONE_NUMBER);
        System.out.println("\nResult " + Result + "\nPhone Number: " + phoneNumber );
    }
    public static void PasswordRegex(String password){
        boolean Result = password.matches(PASSWORD);
        System.out.println("\nResult " + Result + "\nPassword: " + password );
    }

}

