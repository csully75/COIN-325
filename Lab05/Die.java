/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pairofdice;
import java.util.Scanner;
/**
 *
 * @author csullivan156711
 */
class Die {
    private	int num1, sum;
	private final int MAX =6;
	Scanner scan = new Scanner (System.in);
	
	public int getvauleDie(){
	
		System.out.println("Enter in the value for the die.");
		num1 = scan.nextInt();
		if (num1 == -1){
		num1 = (int)(Math.random()*MAX)+1;
		}
		return num1;
	}
	
	public int setvalueDie(int num1, int num2){
	
	 sum = num1 +num2;
		return sum;
	}
}
