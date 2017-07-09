package linkedList;
import java.util.*;
public class InsertNodeTail {
	  class Node {
		     int data;
		     Node next;
		  }
	  
	  Node Insert(Node head,int data) {
		  Node newNode = new Node();
		  Node node = new Node();
		  if(head == null){
			  node.data = data;
			  node.next = null;
			  head = node;
		  }	
		  else{
			  node = head;
			  while(node!=null){
				  node = node.next;
				  if(node == null){
					  newNode.data = data;
					  newNode.next = null;
					  node = newNode;
				  }
				  
			  }
		  }

         return head;
		}
	public static void main(String[] args) {
		
     
	}

}
