/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab07;

import javax.swing.JFrame;



/**
 
 * @author csullivan156711
 */
public class PushRandom_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame frame= new JFrame ("Random number pusher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       frame.getContentPane().add(new PushRandomPanel());
        
       frame.pack();
       frame.setVisible(true);
    }
    
}
