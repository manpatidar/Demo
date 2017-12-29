package multithreading;

import java.util.*;

public class SleepDemo {
   public static void main(String args[]) {
      try { 
         System.out.println("Date before sleep " + new Date( ) + "\n"); 
         Thread.sleep(2220); 
         System.out.println("Date after sleep " + new Date( ) + "\n"); 
      } catch (Exception e) { 
          System.out.println("Got an exception!"); 
      }
   }
}
