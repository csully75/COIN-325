/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PushRandom;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
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
public class PushRandomPanelTester {
    
    public PushRandomPanelTester() {
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
public void PushRandomPanelTester(){
PushRandomPanel.Rand.doClick();
    assertEquals(Integer.parseInt(PushRandomPanel.label.getText()),PushRandomPanel.generator.nextInt());
}

    
   
}
