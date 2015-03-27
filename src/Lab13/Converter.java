/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab13;

/**
 *
 * @author csullivan156711
 */
public class Converter {
  
     public static Integer utoi (String str) { 
     int num; 
        try
        {
        num = Integer.parseInt(str);
        System.out.println(num);
        return num; 
        }
        catch (NumberFormatException exception)
        {
        return null; 
        }
       
     } 

}
