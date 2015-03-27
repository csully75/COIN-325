/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;

/**
 *
 * @author CSullivan156711
 */
public class Rectangle extends Shape2D{
    double height;
     double width;
     double marea;
     int angle; 
     double mcircumfrance;
        public Rectangle(double height, double width) { 
         this.height = height; 
         this.width = width; 
        
   } 
  public double getArea(){
 
   marea = height * width;
 
    return marea;
   }
   
      
   
   public double getCircumference(){
    mcircumfrance = (height *2)+ (width *2);
    return mcircumfrance;
   }
      public int getNumberofAngles(){
  
      return 4; 
      }
        
}
