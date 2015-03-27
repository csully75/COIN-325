/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.util.List;
import lab12.SlinkedList;
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
public class ListTester {
    
    public ListTester() {
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
     public void SLinkedListTest() { 
      SlinkedList  listTest = new SlinkedList(); 
      ArrayList AlistTest = new ArrayList();
  } 
     public void listTest(List list) { 
        list.add(10); 
        list.add(new Integer(11)); 
       list.add(new Integer(16)); 
        
        assertTrue(list.size() == 3); 
        list.add(new Integer(11)); 
        list.add(new Integer(16)); 
       assertTrue(list.size() == 5); 
         
         assertTrue(list.get(3).equals(new Integer(16))); 
}
     public void AlistTest(List list){
     list.add(10); 
        list.add(new Integer(11)); 
       list.add(new Integer(16)); 
        
        assertTrue(list.size() == 3); 
        list.add(new Integer(11)); 
        list.add(new Integer(16)); 
       assertTrue(list.size() == 5); 
         
         assertTrue(list.get(3).equals(new Integer(16))); 
     
     
     
     
     }
}
