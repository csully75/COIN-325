/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javax.swing.JFrame;

/**
 *
 * @author Sully
 */
public class FinalProject {
public static boolean won = false; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        JFrame frame = new JFrame ("Interstellar login");
        JFrame frame1 = new JFrame ("Interstellar");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      
     
         if (won == true){
           frame.dispose();
            frame.setVisible(false);     
         frame1.getContentPane().add(new Gamepanel());
         frame1.pack();
         frame1.setVisible(true);
         
         }
         if(won == false) {
             frame.getContentPane().add(new submitpanel());
        frame.pack();
        frame.setVisible(true); }
        
        
        
    }
    
}
