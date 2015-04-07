/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalProject;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer; 
import java.util.TimerTask;
import javax.swing.*;
/**
 *
 * @author csullivan156711
 */
public class Gamepanel extends JPanel {
    private final int WIDTH = 600, HEIGHT = 500;
    private final int JUMP = 10;
    
    Timer timer = new Timer();
   
    
    private final int IMAGE_SIZE = 31;
     
    private Point point1 = null, point2 = null ; 
    
    private  ImageIcon ship, currentImage, flagship;
    private int x, y; 
    private boolean missle = false; 

public Gamepanel(){
addKeyListener (new DirectionListner());
x = WIDTH / 2;
y = HEIGHT -50 ;
//System.out.println(new java.io.File("test").getAbsolutePath());
 ship = new ImageIcon ("imgs/galaga-ship.gif");
flagship = new ImageIcon ("imgs/flagship.png");

currentImage = ship; 




setBackground (Color.black);
setPreferredSize (new Dimension(WIDTH, HEIGHT));
setFocusable(true);
}
//public void Timer (boolean missle){
//if(missle == true)
//{
//
//
//}
//
//}
    
    public void paintComponent (Graphics page){
super.paintComponent (page);
currentImage.paintIcon (this, page, x, y);
flagship.paintIcon(this, page, 300, 10);
page.setColor(Color.blue);
if (point1 != null && point2 != null)
    page.drawLine (point1.x, point1.y, point2.x, point2.y );
if (missle == true){
page.drawLine(x +22, y-5, x+22, y-25);
page.drawLine( x +22 , y-92, x+22, y-112);
page.drawLine( x +22 , y-187, x+22, y-207);
page.drawLine( x +22 , y-282, x+22, y-302);
page.drawLine( x +22 , y-370, x+22, y-400);

missle = false; 
}

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
                    x+= JUMP;
                    break; 
            case KeyEvent.VK_SPACE:
                missle = true; 
               //repaint();  
              // missle = false; 
              
                
                
                 
            }
         
            repaint();
        }
       
         public void keyTyped (KeyEvent event){}
        public void keyReleased (KeyEvent event){}

       
    }
    

        
    

}
