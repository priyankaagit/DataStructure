package linkedList;

public class PrintElementOfLinkedList {
	 class Node {
		     int data;
		     Node next;
		  }
	  
	 static void Print(Node head) {
		  if(head!=null){
			  System.out.println(head.data);
			  while(head.next!=null){
				  System.out.println(head.next.data);
				  head = head.next;
			  }
				  
		  }
		  
	  }
	public static void main(String[] args) {
		
	}

}
