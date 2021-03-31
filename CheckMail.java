import java.util.Scanner;
/**
 * Write a description of class CheckMail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckMail
{
    
    /**
     * Constructor for objects of class CheckMail
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first dimension of the package?");
        int a = sc.nextInt();
        System.out.print("What is the second dimension of the package?");
        int b = sc.nextInt();
        System.out.print("What is the third dimension of the package?");
        int c = sc.nextInt();
        System.out.print("What is the weight of the package?");
        int weight = sc.nextInt();
        int length = 0;
        if (a > b && a > c) {
            length = a;
        }
        if (b > a && b > c) {
            length = b;
        }
        if (c > a && c > b) {
            length = c;
        }
        int girth = (a + b + c - length) * 2;
        int lg = length + girth;
        if (lg > 100 && weight > 70) {
            System.out.println("Your package is too large and too heavy.");
        }
        else if (lg > 100) {
            System.out.println("Your package is too large.");
        }
        else if (weight > 70) {
            System.out.println("Your package is too heavy.");
        }
        else {
            System.out.println("Your package is acceptable.");
        }
    }
}
