/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetwoalgorithms;

import static timetwoalgorithms.Algorithm.repeat1;
import static timetwoalgorithms.Algorithm.repeat2;

/**
 *
 * @author Coily1805
 */
public class TimeTwoAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Algorithm alg = new Algorithm();
        char a='a';
        
        System.out.println("*****string concat*****");
        long startTime = System.currentTimeMillis();
        //repeat1(a,5000000);
        long endTime=System.currentTimeMillis();
        long elapsed=endTime-startTime;
        System.out.println(elapsed);
        
        
        System.out.println("*****string buider*****");
        startTime = System.currentTimeMillis();
        repeat2(a,50000000);
        endTime=System.currentTimeMillis();
        elapsed=endTime-startTime;
        System.out.println(elapsed);
    }
    
}
