/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_euler;

/**
 *
 * @author Scott
 */
public class JAVA_Euler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // get the start time for elapsed time
        long startTime = System.nanoTime(); 
        
        // Run project euler problem 1
        //PE_1.euler_1();

        // Run project euler problem 2
        PE_2.euler_2();        
        
        // get the end time for elapsed time
        long estimatedTime = System.nanoTime() - startTime;
        // convert to seconds from nanoseconds
        float estimatedTime2 = (float) (estimatedTime * .000000001); 
        System.out.format("Time elapsed (s) %.4f \n", estimatedTime2);

        
    }
    
}
