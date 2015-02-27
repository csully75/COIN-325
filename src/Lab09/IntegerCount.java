/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegerCount;

/**
 *
 * @author Sully
 */
public class IntegerCount {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     final int LIMIT = 100, add = 2;
      int[] arrayints = new int[LIMIT];
        
     for(int i=0;i < LIMIT; i++)
         arrayints[i]= i + add;
     arrayints[5] = 2;
       arrayints[10] = 2;
        arrayints[98] = 2;
          Occurrences(LIMIT, arrayints);
    }
    
    public static void Occurrences(int LIMIT, int[] arrayints){
    int count = 0;
    for(int i=0;i < LIMIT; i++){
        
      for(int j=0; j< LIMIT ; j++){
             
       if(arrayints[i] == arrayints[j] && i != j ){
           count= count + 1;
         arrayints[j] = -1;
       }
            }
      if(count > 1 && arrayints[i] > 0 )
      System.out.println(Print(count, arrayints[i]));
        count = 0;
      
            }
   
    }
    
    
    
    public static String Print(int count,int num){
String Phrase;
Phrase = num + ": " + count;

        return Phrase;
}
 

    
    
    
}
