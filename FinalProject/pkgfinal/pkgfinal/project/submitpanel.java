/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Sully
 */
class submitpanel extends JPanel{
    private JButton Login, Create, Cancel; 
    private JPanel LoginSc; 

    public submitpanel() {
        Login = new JButton ("Login");
        Create = new JButton ("Create Login");
        Cancel = new JButton ("Cancel");
        
        LoginSc = new JPanel();
        LoginSc.setPreferredSize(new Dimension (400, 40));
      // LoginSc.setBackground(Color.lightGray);
        LoginSc.add(Login);
        LoginSc.add(Create);
        LoginSc.add(Cancel);
        
        setPreferredSize (new Dimension(750, 500));
        setBackground(Color.lightGray);
        add (LoginSc);
        
        
    }
    private class ButtonListener implements ActionListener{
    
       
        public void actionPerformed (ActionEvent event)
        {
            
            if (event.getSource() == Cancel)
            {
                
              System.exit(0);
                    }
        }

      
        
        
    }
    
}
