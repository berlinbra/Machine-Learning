
public class OLinkList<L>{
	
     private static class Node<L>{
         Node<L> next;
         L value;
         private Node(L value, Node<L> next){
              this.value = value;
              this.next = next;
         }
     }
	 
     private int size; //privitize
     private Node<L> head; 
     
     public OLinkList(){ //class
         head = new Node<L>(null,head);  //dummy node
         size = 0;
     }
		 
     public L remove(int position){
		 
     	if(position>size || position< 0){
     		throw new IndexOutOfBoundsException("Size of list cannot be smaller than position"); 
     	}
     	Node<L> iterator = head.next; 
     	Node<L> before = head;//keeps track of element before the element we want to remove
     	for(int i = 1; i <= position; i++){
            iterator = iterator.next;
            before = before.next;   
     	}
     	L saved = iterator.value;
     	before.next = iterator.next; 
     	iterator.next = null; 
     	iterator.value = null; 
     	return saved;

     	}
     public void append(L value){ 
         if(value == null){
         	throw new NullPointerException("Attempting to add null element to list"); 
         }
         head.next = new Node<L>(value,head); //points to last element in list
         size++;}
		 
	 // returns private size.
     public int getSize(){ return size;} 
     }