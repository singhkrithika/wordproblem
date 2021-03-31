import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class Permutations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Permutations
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Permutations
     */
    public static void main (String[] args) {
        Permutations perm = new Permutations();
        for (int i = 0; i < 10; i ++) {
           System.out.println(perm.nextPermutation());   
        }
    }
    
    public ArrayList<Integer> nextPermutation () {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i ++) {
            num.add(r.nextInt(10) + 1);
        }
        return num;
    }
}
