/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Sully
 */


  
public class ArrayList implements List{
Object[] array1 = new Object[5];
Object temp; 
   
    @Override
    public Object get(int index) {
        for(int i = 0; i < index; i++){
      
            temp = array1[i];
            
        }
       return temp;
    }

    @Override
    public void add(Object obj) {
        
       Object[] array1 = new Object[10];
       
           for (int v= 0; v < 5; v++){
      
           array1[v + 1] = obj; 
           }
        
        
    }

    @Override
    public int size() {
       
      return array1.length;
    }
     
    
   }

    

