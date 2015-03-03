/*************************************************
* Name:Yevgeny Keyser, Patrick Lacey 		     *
* Asigment07: Project Euler Problem 13.		     *
* Due Date: Tuesday, March 3, 2015 				 *
* Description: Add large numbers 			     *
* Course / Section:IT2045C Computer Programming 2*
* Sources: Stack Overflow 						 *
* Change History: None. 						 *
**************************************************/
package problem13;

public class Main {

	public static void main(String[] args) {
		//Print some text and invoke TestLargeSum method
		System.out.println("The answer is: " + TestLargeSum());
	}
	/**
	 * Create of LargeSum class.
	 * Invoke LargeSum method from that class.
	 * Assign it to BigInteger variable and return it
	 * @return
	 */
	public static Object TestLargeSum() {
		/***
		 * Calls the method "LargeSum" from the LargeSum Class
		 * @return the LargeSum from: LargeSum.java
		 */
		//Declares LargeSum as Sum
		LargeSum Sum = new LargeSum();
		//BigInterger Answer is now equal to LargeSum
		String Answer = Sum.LargeSum();

		//Returns Answer
		return Answer;
	}

}
