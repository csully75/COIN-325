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
    
    private final Timer timer, timer2; 
    
    private final int IMAGE_SIZE = 31;
    private final int DELAY = 20, DELAY2 = 5000; 
     
    private Point point1 = null, point2 = null ; 
    
    private ImageIcon ship, currentImage, flagship;
    private int x, y, xy,xy2,missx, missy, missy2; 
   
    private boolean missle = false, missle2 = true, rightbound = false;

public Gamepanel(){
addKeyListener (new DirectionListner());
timer = new Timer(DELAY, new  DirectionListner());
timer2 = new Timer(DELAY2, new  DirectionListner());
 xy = 300;
 xy2 = 10;
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

    
    public void paintComponent (Graphics page){
super.paintComponent (page);
currentImage.paintIcon (this, page, x, y);
timer.start();
flagship.paintIcon(this, page, xy, xy2);
page.setColor(Color.blue);
if (point1 != null && point2 != null)
    page.drawLine (point1.x, point1.y, point2.x, point2.y );
if (missle == true){
    missx = x+22;
  missy = y -5;
   missy2 = y-25;
    timer.stop();
    timer2.start();
page.drawLine(missx , missy, missx , missy2);
page.drawLine( missx  , y-92, missx, y-112);
page.drawLine( missx  , y-187, missx , y-207);
page.drawLine( missx  , y-282, missx , y-302);
page.drawLine( missx, y-370, missx , y-400);
timer2.stop();
timer.start();
missle = false;
if (x +22 > xy && x + 22 < xy + 40){
    timer.stop();
    timer2.stop();
JOptionPane.showConfirmDialog(null, " You Won! Want to play again?");
 FinalProject.won  = true; 
   FinalProject.main(null);
}

}
//if (missle2 == true){
//    missx = xy+22;
//  missy = xy2 +5;
//   missy2 = xy+25;
//    timer.stop();
//    timer2.start();
//page.drawLine(missx , missy, missx , missy2);
//page.drawLine( missx  , y+92, missx, y+112);
//page.drawLine( missx  , y+187, missx , y+207);
//page.drawLine( missx  , y+282, missx , y+302);
//page.drawLine( missx, y+370, missx , y+400);
//timer2.stop();
//timer.start();
//missle2 = false;
//if (xy +22 > x && xy + 22 < x + 40){
//    timer.stop();
//    timer2.stop();
//JOptionPane.showConfirmDialog(null, " You Lost! Want to play again?");
// FinalProject.won  = true; 
//   FinalProject.main(null);
//}
//
//}
    }
 

   private class DirectionListner implements KeyListener, ActionListener {

      
     
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
            }
            repaint();
        }
         public void keyTyped (KeyEvent event){}
        public void keyReleased (KeyEvent event){}
        
        public void actionPerformed (ActionEvent event){
            
           missy -= 67;
         missy2 -=87;
            
            
            
            xy += 10;
            if(xy >= 550){
            rightbound = true; 
            }
            if (rightbound == true){
            xy -=20;
            if (xy <= 5){
                rightbound = false; 
            }
            }
          
        
            
            repaint();
        
       }

       
    }
    

        
    

}