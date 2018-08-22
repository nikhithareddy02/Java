import java.util.Date;
import java.util.Random;

//Java code for thread creation by implementing
//the Runnable Interface
class MultithreadingDemo implements Runnable
{
 public void run()
 {
     try
     {
         // Displaying the thread that is running
         System.out.println ("Thread " +
                             Thread.currentThread().getId() +
                             " is running - " + new Date() + "\tRandom Number is " + printNumber());

     }
     catch (Exception e)
     {
         // Throwing an exception
         System.out.println ("Exception is caught");
     }
 }
 public int printNumber() {
	 Random rand = new Random();
	 return rand.nextInt(50);
 }
}

//Main Class
public class MultiThread
{
 public static void main(String[] args)
 {
     for (int i=0; i<8; i++)
     {
         Thread object = new Thread(new MultithreadingDemo());
         object.start();
     }
 }
}
