/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab18;

/**
 *
 * @author csullivan156711
 */
public interface Hash<K,V> {
    public void put (K key, V vaule);
    public V get (K key);
    public int size();
    
}
