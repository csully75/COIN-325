/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pairofdice;

/**
 *
 * @author csullivan156711
 */
public class PairOfDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sum, num1, num2;
		
		Die die1 = new Die();
		Die die2 = new Die();
		Die total = new Die();
		
		 num1 = die1.getvauleDie();
		 num2 = die2.getvauleDie();
		 sum = total.setvalueDie(num1, num2);
		
		System.out.println ("The sum is: " + sum);
		
    }

   
    
}
