/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab14;

/**
 *
 * @author Sully
 */
public class DivisorCalc {
    public static int gcd(int num1, int num2){ 
     
     if (num2 == 0)
     {
         System.out.println(num1);
          return num1; 
     }
     if  (num2 > num1 )
     {
         return gcd(num2, num1);
     }
      else
        return gcd(num2 ,num1 % num2);
}
        }
    


