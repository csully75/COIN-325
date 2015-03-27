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
public class RightTriangle extends Shape2D{ 
      
    double height;
    double base; 
    double marea; 
    double mcircumfrance ;
     // You may assume a and b are the legs and c is the hypo 
     public RightTriangle(double h, double b) { 
         height = h;
         base = b; 
    } 

   public double getArea(){
 
   marea = (height *base)/ 2 ;
 
    return marea;
   }
   
      
   
   public double getCircumference(){
       
    mcircumfrance = Math.sqrt((Math.pow(height, 2) + Math.pow(base, 2)));
    return mcircumfrance;
   }
   public int getNumberofAngles(){
  
      return 3; 
   }
}
