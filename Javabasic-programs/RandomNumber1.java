import java.lang.Math;
public class RandomNumber1 {
    public static void main(String args[])
    {
int min = 200;// this is not required but we are using a function max-min+1+min
int max = 400;// so i m assigning max and min value to it.

        // Genarating random numbers
        System.out.println("1st Random Number:" +Math.random()*(max-min + 1) + min);
        System.out.println("2nd Random Number:" +Math.random()*(max-min + 1) + min);
        System.out.println("3rd Random number:" +Math.random()*(max-min +1) + min);
        System.out.println("4th Random number:" +Math.random()*(max-min +1) + min);
    }
    
}