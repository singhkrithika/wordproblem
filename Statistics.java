
/**
 * Write a description of class Statistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Statistics
{
   // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Statistics
     */
    public Statistics()
    {
        // initialise instance variables
        x = 0;
    }
    
     public void statistics(int[] numbers)
    {
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average = average + numbers[i];
        } 
        average = average/(numbers.length);
        System.out.println("Average: " + average);
        double standard_deviation = 0;
        double difference = 0;
        for (int i = 0; i < numbers.length; i++) {
            difference += (numbers[i] - average)**2;
        }
        standard_deviation = standard_deviation + difference;
        System.out.println("Sum of the Square of Differences: " + standard_deviation);
        standard_deviation = standard_deviation/(numbers.length - 1);
        standard_deviation = sqrt(standard_deviation);
        System.out.println("Standard Deviation: " + standard_devitation);
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> frequency = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
        
        }
    }
}
