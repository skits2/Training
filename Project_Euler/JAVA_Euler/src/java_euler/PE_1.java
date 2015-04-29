/*
 * Project Euler problem 1
 * https://projecteuler.net/problem=1
 *
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 *  we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *  Find the sum of all the multiples of 3 or 5 below 1000.
 */
package java_euler;

/**
 *
 * @author Scott
 * This will loop through all numbers 1 to 999 and use the modulus function
 * to find numbers with a remainder of zero when divided by 3 or 5
 */
public class PE_1 {
    public static void euler_1() {
        int cumulative_sum = 0;
        for (int i=1; i<1000; i++){  // loop through all numbers less than 1000
            if (i%3 == 0 || i%5==0) {  // look for remainder of 0
               cumulative_sum+= i;
            }
        }
        
        System.out.println("Problem 1 :" + cumulative_sum);
    }
}
