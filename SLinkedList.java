/*
  A singly linked list. 

  Author: Bojian Xu, bojianxu@gmail.com
*/

public class SLinkedList{
    protected Node head; 
    protected long size; 
    
    public SLinkedList(){
	head = null; 
	size = 0;
    }

    /* add node v at the beginning of the list */
    public void addFirst(Node v){
	if(v == null)
	    return; 

	v.setNext(head);
	head = v; 
	size ++;
    }
    
    /* add node v at the end of the list */
    public void addLast(Node v){
	if(size == 0)
	    addFirst(v);
	else{
	    Node cur; 
	    for(cur = head; cur.getNext() != null; cur = cur.getNext())
		;
	    v.setNext(null);
	    cur.setNext(v); 
	    size ++; 
	}
    }

    /* remove the first node of the list */
    public Comparable removeFirst(){
	if(size == 0)
	    return null; 
	
	Node old_head = head; 
   Comparable n = head.getElement();
	head = head.getNext(); 
	size --; 
	old_head.setNext(null);
   return n;
	
	//If using C or C++, the memoery for the deleted node needs to be freed. 
    }

    /* remove the last node of the list */
    public void removeLast(){
	if(size == 0)
	    return; 
	else if(size == 1)
	    removeFirst();
	else{
	    Node cur; 
	    for(cur = head; cur.getNext().getNext() != null; cur = cur.getNext())
		;
	    cur.setNext(null);
	    size --;
	}
	//If using C or C++, the memoery for deleted node needs to be freed. 
    }

    /* Insert node v right after node u*/
    public void addAfter(Node u, Node v){
	if(u == null)
	    return; 
	
	v.setNext(u.getNext()); 
	u.setNext(v);
	size ++;
    }

    /* Insert node v right before node u*/
    public void addBefore(Node u, Node v){
	if(u == null)
	    return;
	else if(u == head)
	    addFirst(v);
	else{
	    Node cur; 
	    for(cur = head; cur.getNext() != u; cur = cur.getNext())
		;
	    v.setNext(u);
	    cur.setNext(v);
	    size ++;
	}
    }
    
    /* remove the node that is right after v */
    public void removeAfter(Node v){
	if(v == null)
	    return;

	if(v.getNext() == null)
	    return; 
	
	Node deleted = v.getNext(); 
	v.setNext(v.getNext().getNext());
	deleted.setNext(null); 
	size --;
    }

    /* remove the node that is right before v */
    public void removeBefore(Node v){
	if(v == null)
	    return;
	if(v == head)
	    return; 

	if(head.getNext() == v){
	    Node old_head = head; 
	    head = v;
	    old_head.setNext(null);
	}
	else{
	    Node cur; 
	    for(cur = head; cur.getNext().getNext() != v; cur = cur.getNext())
		;
	    Node deleted = cur.getNext(); 
	    cur.setNext(v);
	    deleted.setNext(null);
	}
	size --; 
    }
    
    /* The concatenation of all the elements in the list */
    public String toString(){
	StringBuilder all = new StringBuilder();
	for(Node cur = head; cur != null; cur = cur.getNext())
	    all.append(cur.getElement() + "   ");
	return all.toString();
    }

    /*
      You can add and implement any other methods that you need here
      to play with this singly linked list for the purposes in your applications.
     */
     
   
}


