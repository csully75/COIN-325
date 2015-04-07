/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author Sully
 */
class submitpanel extends JPanel{
    private final JButton Login, Create, Cancel; 
    private final JLabel Us1,pass, welcome;
    private final JPanel LoginSc,TextBox,wel;  
    private final JTextField user2, pass2;
    private String name, inputUser, inputPass, text; 
    //some variables will be used later
    private int password; 
    private String numstr;
    public submitpanel() {
        setLayout (new BorderLayout());
        
        Login = new JButton ("Login");
        Create = new JButton ("Create Login");
        Cancel = new JButton ("Cancel");
        
        Us1 = new JLabel ("User:");
        pass = new JLabel ("Password:");
        welcome = new JLabel("Interstellar");
        
        user2 = new JTextField (10);
        pass2 = new JTextField (10);
        
        ButtonListener Listener = new ButtonListener(); 
        Login.addActionListener(Listener);
        Create.addActionListener(Listener);
        Cancel.addActionListener(Listener);
        
        
        LoginSc = new JPanel();
        LoginSc.setPreferredSize(new Dimension (400, 40));
        LoginSc.setBackground(Color.lightGray);
        LoginSc.add(Login);
        LoginSc.add(Create);
        LoginSc.add(Cancel);
        
        TextBox = new JPanel();
        TextBox.setPreferredSize(new Dimension (400, 40));
        TextBox.setBackground(Color.lightGray);
        TextBox.add(Us1);
        TextBox.add(user2);
        TextBox.add(pass);
        TextBox.add(pass2);
        
        wel = new JPanel();
        wel.setPreferredSize(new Dimension (400, 40));
        wel.setBackground(Color.lightGray);
        wel.add(welcome);
        
        setPreferredSize (new Dimension(400, 150));
        setBackground(Color.lightGray);
        add (TextBox,BorderLayout.CENTER);
        add (wel,BorderLayout.NORTH);
        add (LoginSc,BorderLayout.SOUTH);
       
    }
    private class ButtonListener implements ActionListener{
    
       
        
        public void actionPerformed(ActionEvent event)
        {
            
            if (event.getSource() == Cancel)
            {
              System.exit(0);
                    }
            if (event.getSource() == Create)
            {
            name = JOptionPane.showInputDialog("Enter your User Name");
            numstr = JOptionPane.showInputDialog("Enter a four digit number"
                    + " for your Password");
            password = Integer.parseInt(numstr);
           // Database(name, password);
            //pasword may need to be used later
            
            
        }
            if (event.getSource() == Login)
            {
                text = user2.getText();
         if (name.equals(text));{
                text = pass2.getText();
            if(numstr.equals(text));{System.out.println("you did it!");}
             // super.frame.getContentPane().add(new Gamepanel());
            }
            }
    
    }

       
    
    }}
