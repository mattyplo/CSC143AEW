package Week9;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {
   
	private Node<Item> first;
	private Node<Item> last; 
	private int size;
	
	private class Node<Item> {
		Item item;
		Node<Item> next;
		Node<Item> prev;
	}
	
    public Deque() {        
	   // construct an empty deque
    	first = null;
    	last = null;
    	size = 0;
    }
    
    public boolean isEmpty() {
	    return first == null;
    }
    
    public int size() {
	    return size;
    }
    
    public void addFirst(Item item) {
	   if (item == null) {
		   throw new IllegalArgumentException();
	   }
    	
    	if (first == null) {
	 	   first = new Node<Item>();
		   first.item = item;
		   last = first;
		   size++;
	    } else {
	  	   Node<Item> oldFirst = first;
		   first = new Node<Item>();
		   first.item = item;
		   first.next = oldFirst;
		   oldFirst.prev = first;
		   // size is one, last still points to null, needs to point to first
		   // but it only needs to do this once.  
		   if(size == 1) {
			   last.prev = first;
		   }
		   size++;
	    }
    }
    
    public void addLast(Item item)  {
    	if (item == null) {
 		   throw new IllegalArgumentException();
 	    }
    	
    	if (first == null) {
	  	   first = new Node<Item>();
	 	   first.item = item;
		   last = first;
		   size++;
	     } else {
	    	 Node<Item> oldLast = last;
	    	 last = new Node<Item>();
	    	 last.item = item;
	    	 oldLast.next = last;
	    	 last.prev = oldLast;
	    	 if(size == 1) {
	    		 first.next = last;
	    	 }
	    	 size++;
	     }
    }
    
    public Item removeFirst()   {
	    if (size == 0) {
	    	throw new NoSuchElementException();
	    }
    	Node<Item>newFirst = first.next;
	    Node<Item> oldFirst = first; 
	    first = newFirst;
	    size--;
	    if (size == 0) {
	    	last = null;
	    	first = null;
	    }
	    return oldFirst.item;
    }
    
    public Item removeLast()  {
    	if (size == 0) {
    		throw new NoSuchElementException();
    	}
	    Node<Item> oldLast = last;
	    last = last.prev;
	    size--;
	    if (size == 0) {
	    	first = null;
	    	last = null;
	    }
	    return oldLast.item;
    }
    
    public Iterator<Item> iterator()  {
	    
    	return new ListIterator(first);
  
    }
  
    private class ListIterator implements Iterator<Item> {
    	
    	private Node<Item> current;
    	
    	public ListIterator(Node<Item> given) {
    		current = given;
    	}
    	
    	public boolean hasNext() {
    		return current != null;
    	}
    	public Item next() {
    		if (current == null) {
    			throw new NoSuchElementException();
    		}
    		Item item = current.item;
    		current = current.next;
    		return item;
    	}
    }
    
    public static void main(String[] args) {
	    // unit testing (optional)
    }
}