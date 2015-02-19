/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab08;

import javax.swing.JOptionPane;
/**
 *
 * @author csullivan156711
 */
public class DialogSumProduct {
    
    
    public static void main (String[] args){
    int num1, num2 ,sum, product,again;
    String pharse, result;
    
    do{

        pharse = JOptionPane.showInputDialog ("Please enter the first integer: ");
        num1 = Integer.parseInt(pharse);

        pharse = JOptionPane.showInputDialog ("Please enter the second integer: ");
        num2 = Integer.parseInt(pharse);
        sum = num1 + num2;
        product = num1 * num2;
        result = "The sum is: " + sum;
        JOptionPane.showMessageDialog(null,result);
        result = "The product is: " + product;
        JOptionPane.showMessageDialog(null,result);
        
      
        again = JOptionPane.showConfirmDialog(null, "Do Another?");
}
while ( again == JOptionPane.YES_OPTION);

    
    }
    
    
}
