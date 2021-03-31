import java.util.Scanner;
/**
 * Write a description of class IRS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IRS
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class IRS
     */
    public IRS()
    {
        
    }

    public double sampleMethod()
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("What is your Filing Status? Single = 1 & Married = 2 ");
        int filingStatus = sc.nextInt();
        System.out.print("What is your taxable income? ");
        double income = sc.nextInt();
        if (filingStatus == 1) {
             if (income > 0 && income < 27050) {
                return (income * 0.15);
            }
            if (income > 27050 && income < 65550) {
                return 4057.50 + 0.275*(income - 27050);
            }
            if (income > 65550 && income < 136750) {
                return 14645 + 0.305*(income - 65550);
            }
            if (income > 136750 && income < 297350) {
                return 36361 + 0.355*(income - 136750);
            }
            if (income > 297350){
                return 93374 + 0.391*(income - 297350);
            }
        }
        if (filingStatus == 2) {
            if (income > 0 && income < 45200) {
                return (income * 0.15);
            }
            if (income > 45200 && income < 109250) {
                return 6780 + 0.275*(income - 45200);
            }
            if (income > 109250 && income < 166500) {
                return 24393 + 0.305*(income - 109250);
            }
            if (income > 166500 && income < 297350) {
                return 41855 + 0.355*(income - 166500);
            }
            if (income > 297350){
                return 88306 + 0.391*(income - 297350);
            }
        }
        return 0;
    } 
}
