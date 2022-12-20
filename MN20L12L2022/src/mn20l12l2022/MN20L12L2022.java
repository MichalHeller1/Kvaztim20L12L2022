/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn20l12l2022;

/**
 *
 * @author מיכל
 */
public class MN20L12L2022 {
    public static void q1(Queue<Integer> q) {
        Stack<Integer> s=new Stack<>();
        int min=1000000;
        while (!q.isEmpty()) {            
             while (!q.isEmpty()) { 
                 if(q.head().getValue()<min){
                     min=q.head().getValue();
                 }
                 s.push(q.head().getValue());
                 q.remove();
            }
            
             min=10000;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c=3;
        System.out.println(c);
               
    }
    
}
