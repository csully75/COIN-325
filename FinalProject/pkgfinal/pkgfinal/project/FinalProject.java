/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import javax.swing.JFrame;

/**
 *
 * @author Sully
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        JFrame frame = new JFrame ("Intersellar login");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
      frame.getContentPane().add(new submitpanel());
        
        frame.pack();
        frame.setVisible(true); 
        
        
        
    }
    
}
