package Lab14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class GCDTester {
    
    public GCDTester() {
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

    @Test
    public void GCDTest() {
    assertTrue(DivisorCalc.gcd(3, 9) == 3);
    assertTrue(DivisorCalc.gcd(10, 15) == 5);
    assertTrue(DivisorCalc.gcd(9, 3)== 3);
    assertTrue(DivisorCalc.gcd(49, 21)== 7);
    assertTrue(DivisorCalc.gcd(100, 10)== 10);
    assertTrue(DivisorCalc.gcd(10, 100)== 10);
    assertTrue(DivisorCalc.gcd(19, 1)== 1);
    assertTrue(DivisorCalc.gcd(48, 24)== 24);
    assertTrue(DivisorCalc.gcd(77, 14)== 7);
           
   }
}
