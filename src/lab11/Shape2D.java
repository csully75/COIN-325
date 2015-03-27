/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;
import java.util.Scanner;
/**
 *
 * @author CSullivan156711
 */
public class Shape2D {
   static  private double area; 
  static  private int angle; 
     static private double circumfrence; 
       static  private double radius; 
  static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Enter how many angles your shape has");
    angle = scan.nextInt();
    switch (angle)
    {
        case 0: 
        { System.out.println("Enter in the radius");
            radius = scan.nextInt();
            Circle circle1 = new Circle(radius); 
                area = circle1.getArea();
        circumfrence = circle1.getCircumference();
          System.out.println("The Area is " + area+ " and the circumfrence"
                   + " is " + circumfrence + ". " + "With " +
                  + getNumberOfAngles() + " angles.");
        }
            break;
        case 1:
            System.out.println("no shape with 1 angle");
            break;
        case 2:
            System.out.println("no shape with 2 angles");
            break;
        case 3:
            double h, b; 
            System.out.println("Enter in height of the trigangle");
            h = scan.nextInt();
            System.out.println("Enter in lengh of the base of the trigangle");
            b = scan.nextInt();
            
            RightTriangle trig1 = new RightTriangle(h,b);
            area = trig1.getArea();
             circumfrence = trig1.getCircumference();
            System.out.println("The Area is " + area+ " and the circumfrence"
                   + " is " + circumfrence + ". " + "With " +
                  + getNumberOfAngles() + " angles.");
            break;
             
        case 4:
            double length, width; 
            System.out.println("Enter in length of the rectaangle");
            length = scan.nextInt();
            System.out.println("Enter in width of the rectaangle");
            width = scan.nextInt();
            Rectangle rect1 = new Rectangle(length, width);
          area = rect1.getArea();
          circumfrence = rect1.getCircumference();
            
            System.out.println("The Area is " + area+ " and the circumfrence"
                   + " is " + circumfrence + ". " + "With " +
                  + getNumberOfAngles() + " angles.");
            break;
            
     
    }
    }
  

    static  public final int getNumberOfAngles() { 
        return angle;    
     } 

    
}
