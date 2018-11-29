/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer  
{
    // instance variables - replace the example below with your own
    long startTime;

    int number= 60;
    /**
     * Constructor for objects of class Timer
     */
    public Timer()
    {
        startTime = java.lang.System.currentTimeMillis()+91000;
        //System.out.println(java.lang.System.currentTimeMillis());
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public long Time()
    {
        long tijd = (startTime -java.lang.System.currentTimeMillis()) / 1000;
        
        //System.out.println(tijd);
        return tijd;
    }
}
