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
public class Circle extends Shape2D{ 
int temp;
   double mcircumfrance;
   double mRadius;
   double marea; 
    public Circle(double radius) {
        mRadius = radius;
    }
  
  
   public double getArea(){
 
   marea = Math.PI * Math.pow( mRadius,2);
 
    return marea;
   }
   
      
   
   public double getCircumference(){
    mcircumfrance = mRadius * Math.PI * 2;
    return mcircumfrance;
   }
   
public int getNumberofAngles(){
  
      return 0; 
}
}
