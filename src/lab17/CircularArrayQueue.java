/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

/**
 *
 * @author Sully
 */
public class CircularArrayQueue<T> implements Queue<T> { 
    private final static int DEFAULT_CAPACITY = 100; 
    private int mFront, mRear, mCount; 
    private T[] mQueue; 
      
    public CircularArrayQueue(int initialCapacity) { 
         mFront = mRear = mCount = 0; 
         mQueue = (T[]) (new Object[initialCapacity]); 
    } 
      
    public CircularArrayQueue() { 
         this(DEFAULT_CAPACITY); 
     } 
 
 
    @Override 
     public void enqueue(T element) { 
         if (size() == mQueue.length) { 
            // The queue is full, just throw an exception! 
            throw new UnsupportedOperationException("Array is out of space!"); 
        } 
         
         mQueue[mRear] = element; 
         mRear = (mRear + 1) % mQueue.length; 
         mCount++; 
     } 

 
     @Override 
    public T dequeue() throws EmptyCollectionException { 
         if (isEmpty()) {
            throw new EmptyCollectionException();
        }
       T result = mQueue[mFront];
		mQueue[mFront] = null;
		mFront = (mFront + 1) % mQueue.length;

		mCount--;

		return result;
        
    } 
 
 
     @Override 
     public T first() throws EmptyCollectionException { 
        if (isEmpty()) {
            throw new EmptyCollectionException();
          }
        
         //mFront = (mRear+1) -  mCount; 
         return mQueue[mFront]; 
   
     } 
 
 
     @Override 
     public boolean isEmpty() { 
         if(mCount == 0){
             return true;}
         else {return false; }
     } 
 
 
     @Override 
    public int size() { 
         return mCount; 
     } 
      
 } 


