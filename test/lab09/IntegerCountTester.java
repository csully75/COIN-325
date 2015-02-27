/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegerCount;

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
public class IntegerCountTester {
    
    public IntegerCountTester() {
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
    //@Test
    //public void reveiveTest(){
   // IntegerCount ic = new IntegerCount();
    
    
     @Test
    public void receiveTest() {
       final int LIMIT = 100, add = 2;
       int[] arrayints = new int[LIMIT];
      
       int count = 3, j = 2;
       String str = "2: 3";
        
        for(int i=0;i < LIMIT; i++)
           arrayints[i]= i + add;
       arrayints[5] = 2;
        arrayints[10] = 2;
         arrayints[98] = 2;
        arrayints[30] = 5;
        arrayints[31] = 5;
        
       IntegerCount.Occurrences( LIMIT, arrayints);

        
        
       assertTrue(str.equals(IntegerCount.Print(count , j)));
      str = "2: 5";
       assertTrue(str.equals(IntegerCount.Print(5 , 2)));
        str = "3: 2";
      assertTrue(str.equals(IntegerCount.Print(2 , 3)));
       
      
    }
    
   
    
    
    
}
