/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetwoalgorithms;

/**
 *
 * @author Coily1805
 */
public class Algorithm {

    public Algorithm() {
    }
    
    public static String repeat1(char c, int n){
            String answer="";
            for (int i = 0; i < n; i++) {
                answer+=c;
                
                
            }return answer;
        }
    
    
    
    public static String repeat2(char c, int n){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(c);
                
                
            }return sb.toString();
        }
    
}
