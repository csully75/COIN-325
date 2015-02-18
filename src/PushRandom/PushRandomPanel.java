/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PushRandom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author csullivan156711
 */
class PushRandomPanel extends JPanel {
  public static JButton Rand;
     public static JLabel label;
    static  Random generator = new Random();
        public JPanel buttonPanel;
        public static  final int max=100;
    public PushRandomPanel() {
     Rand = new JButton("push for a random number");
      
      ButtonListener listener = new ButtonListener();
      Rand.addActionListener (listener);
      
      label = new JLabel ("");
      buttonPanel = new JPanel();
      buttonPanel.setPreferredSize(new Dimension(200,40));
      buttonPanel.add (Rand);
      
      setPreferredSize (new Dimension(200, 80));
      setBackground (Color.cyan);
      add (label);
      add (buttonPanel);
      
    }

  
    
    public  class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            if (event.getSource()== Rand){
                 
                  
                    String number;
                    int num;
                    num = generator.nextInt(max)+1;
                     number= "" + num;
                   label.setText(number);
            };
        }


    }
    
}