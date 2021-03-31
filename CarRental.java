/*
 * LAB ASSIGNMENT A10.2 page 16 of 17 CarRental  Background:   When you rent a car 
 * from an agency, the key ring has several pieces of information: license 
 * plate, make and year of car, and usually a special code. This code could be
 * used for some data processing within the company's computers. This lab will
 * practice determining that special car rental code from the license plate.  
 * Assignment:  The following sequence of steps will be used to convert a 
 * license plate into a car rental code.   A license plate consists of 3 letters 
 * followed by a 3 digit integer value.   Type in the license plate information 
 * as 3 characters followed by a single integer value. 
 * For example, CPR 607.   Add up the ASCII values of the 3 letters, 67 + 80 + 82
 * = 229.
 * Add the sum of the letters to the single integer value. For example, 229 +
 * 607 = 836.  Take this sum (836) and determine the integer remainder after 
 * dividing by 26: 836 % 26 = 4.  Take your answer to the previous step and
 * determine that letter in the alphabet after 'A'. For example, if you have
 * 836 % 26 = 4 then you would take the 4th letter after 'A': 4th letter after
 * 'A' = E.  Combine the letter and the sum, the car id number for license 
 * plate Ex: CPR 607 = E836.  You may assume that all sample data will be in the
 * format of 3 alphabet characters, then a space, followed by a 3 digit 
 * integer.Prompt the user for the make and model of the car. Use strings to 
 * create this part. User input is shown in bold below.
 *  Example:   Enter Make: Chevrolet  Enter Model: Suburban  . Prompt the user for the 
 * license plate. Example:   Enter Licence Plate: CPR 607  . Print a summary of the 
 * output in this format:   Make = Chevrolet Model = Suburban  CPR 607 = E836  . Solve
 * the following run outputs:   RJK 492  SPT 309.   The input values for the make and
 * model strings are your choice.   
 */
import java.util.Scanner;
/**
 * Write a description of class CarRental here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarRental
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class CheckMail
     */
    public CarRental()
    {
        // initialise instance variables
       
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the make of your car: ");
        String make = scan.next();
        System.out.println("Please enter the model of your car: ");
        String model = scan.next();
        System.out.println("Please enter the license plate of your car: ");
        String plate = scan.next();
        int platenum = scan.nextInt();
        System.out.println("Make: " + make + "\nModel: " + model);
        int value = (int) plate.charAt(0) + (int) plate.charAt(1) + (int) plate.charAt(2) + platenum;
        char letter =((char) ((value % 26) + 65));
        System.out.println(plate + " " + platenum + " = " + letter + value);
    }
        
   
}
