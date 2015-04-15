public class Node
{
//straight forward Node class, nothing special
      private Comparable item;
      private Node next;
      private Node head;
            
      public Node(Comparable i)
      {
	      this.item = i;
         this.next=null; 
      }
      public Comparable getElement()
      {
         return this.item;
      }
      
      public void setElement(Comparable i)
      {
         this.item = i;
      }
      
      public void setNext(Node n)
      {
         this.next = n;
      }
      public Node getNext()
      {
         return this.next;
      }
}//endNode