package year.leap;

import java.util.Scanner;

public class Leap {
	
	     // method to check a year is leap or not
	   public  String isLeap(int year) {
		   if((year%400==0)||((year%4==0)&&(year%100!=0)))  // condition to check a year is leap or not
			   return "yes";
		   else
			   return  "no";
	   }

	public static void main(String[] args) {
	
         int year;
         Scanner get = new Scanner(System.in);
          
         // getting a input from a user
         System.out.print("enter a year:");
         year= get.nextInt();
         
         // output
         Leap obj =new Leap();
         System.out.println("Leap year: "+obj.isLeap(year));       
	}

}
