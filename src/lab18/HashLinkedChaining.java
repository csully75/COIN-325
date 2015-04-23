/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab18;

import java.util.LinkedList;

/**
 *
 * @author csullivan156711
 * @param <K>
 * @param <V>
 */
public class HashLinkedChaining<K, V> implements Hash<K,V> { 
    private final Object[] mTable; 
    private int mCount; 
      
     HashLinkedChaining() { 
         mTable = (new Object[2]); 
        for (int i = 0; i < mTable.length; i++) { 
            mTable[i] = new LinkedList<HashNode<K,V>>(); 
         } 
     } 
 
 
     @Override 
     public void put(K key, V value) { 
         if (key == null || value == null){ 
            return; 
        } 
         
         LinkedList<HashNode<K,V>> list = (LinkedList<HashNode<K,V>>) 
                 mTable[Math.abs(key.hashCode()) % mTable.length]; 
          mCount++;
         list.add(new HashNode(key, value)); 
     } 

 
   @Override 
    public V get(K key) { 
        V ret; 
       if (key == null) { 
            return null; 
        } 
        
       LinkedList<HashNode<K,V>> list = (LinkedList<HashNode<K,V>>) 
                 mTable[Math.abs(key.hashCode()) % mTable.length]; 
       ret = list.getFirst().getValue();
         for(int i = 0; i < list.size() ;i++){
           if(key.equals(list.get(i).getKey()))
               ret = (V) list.get(i).getValue();
       }
       return ret; 

     } 
 
 
     @Override 
   public int size() { 
      
       return mCount; 
  } 
}