package year.leap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapTest {

	@Test
	void test() {
		
	   Leap test = new Leap();
	     int a[] = {2000,1900,2020,2010}; 
	     
	     /* 2000 - it is leap year because it is divisible by 400
	      * 1900 - it is not a leap year because it is divisible by 100 eventhough divisible by 4
	      * 2020 - it is leap year because it is divisible by 4 but not 100
	      * 2010 - it is not a leap year because it is not divisible by 400 and 4
	      */
	     
	     /* these 4 test cases are boundary cases i.e it covers all area of program flow
	      */
       
	     String expect[]= {"yes","no","yes","no"};
         String actual[]= {test.isLeap(a[0]),test.isLeap(a[1]),test.isLeap(a[2]),test.isLeap(a[3])};
        
         assertArrayEquals(expect,actual);	
	}
	
}
