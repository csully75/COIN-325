/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sully
 */
public class Gamepanel extends JPanel {
    private final int WIDTH = 600, HEIGHT = 500;
    private final int JUMP = 10;
    
    private final int IMAGE_SIZE = 31;
     
    private Point point1 = null, point2 = null ; 
    
    private  ImageIcon ship, currentImage, flagship;
    private int x, y; 
    

public Gamepanel(){
addKeyListener (new DirectionListner());
x = WIDTH / 2;
y = HEIGHT -20 ;
 ship = new ImageIcon ("galaga-ship.gif");
flagship = new ImageIcon ("flagship.png");

currentImage = ship; 




setBackground (Color.black);
setPreferredSize (new Dimension(WIDTH, HEIGHT));
setFocusable(true);
}
    
    public void paintComponent (Graphics page){
super.paintComponent (page);
currentImage.paintIcon (this, page, x, y);
flagship.paintIcon(this, page, x, 10);
page.setColor(Color.blue);
if (point1 != null && point2 != null)
    page.drawLine (point1.x, point1.y, point2.x, point2.y );
else page.drawLine(x, y+1, x, y+2);


}

    private class DirectionListner implements KeyListener {
 
    
     
        public void keyPressed (KeyEvent event) {
            switch (event.getExtendedKeyCode()){
                case KeyEvent.VK_LEFT:
                 currentImage = ship; 
                    x-= JUMP;
                    break; 
                    
            case KeyEvent.VK_RIGHT:
                 currentImage = ship; 
                    x-= JUMP;
                    break; 
            case KeyEvent.VK_SPACE:
                
                 
            }
         
            repaint();
        }
       
         public void keyTyped (KeyEvent event){}
        public void keyReleased (KeyEvent event){}

       
    }
    

        
    

}