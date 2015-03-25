/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sully
 */
public class ShapeTester {
    
    public ShapeTester() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     private double delta = 0.0001;
    @Test
    public void circleTest() {
        double area; 
        Shape2D.angle = 0; 
         Circle circle1 = new Circle(1.0); 
       area = circle1.getArea();
         
        assertTrue(circle1.getNumberOfAngles() == 0);
        assertEquals((Math.PI * 1.0 * 1.0), area);
        assertEquals((Math.PI * 2.5 * 2.5), new Circle(2.5).getArea(), delta);
    }
    
    @Test
    public void rightTriangleTester() {
       RightTriangle rTriangle = new RightTriangle(1.0, 1.0);
        
        assertTrue(rTriangle.getNumberOfAngles() == 3);
        assertEquals(1.0 * 1.0 /2.0, rTriangle.getArea(), delta);
        assertEquals(3.4 * 6.5 /2.0, new RightTriangle(3.4, 6.5).getArea(), delta);
    }
    @Test
    public void rectangleTester() {
      Rectangle rect = new Rectangle(1.0, 1.0);
        
        assertTrue(rect.getNumberOfAngles() == 4);
        assertEquals(1.0 * 1.0, rect.getArea(), delta);
        assertEquals(3.4 * 6.5, new Rectangle(3.4, 6.5).getArea(), delta);
    }

}
