import java.util.Scanner;
public class DoubleLinkedList 
{
	static class ListNode
	{
		int data;
		ListNode prev=null,next=null;
		public ListNode(int data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	// Creating Head
	ListNode head;
	public void insert(DoubleLinkedList list,int data)
	{
		ListNode new_node=new ListNode(data);
		new_node.prev=null;
		new_node.next=null;
		
		ListNode curr_node;
		
		curr_node=list.head;
		if(curr_node==null)
		{
			list.head=new_node;
			
			return;
		}
		else 
		{	
			while(curr_node.next!=null)
			{
				curr_node=curr_node.next;
			}
			new_node.prev=curr_node;
			curr_node.next=new_node;
			
			return;
		}
	}
	
	//Inserting At Beg.
	public void insertAtBeg(DoubleLinkedList list,int data)
	{
		ListNode new_node=new ListNode(data);
		new_node.prev=null;
		new_node.next=null;
		
		ListNode curr_node;
		curr_node=list.head;
		new_node.next=curr_node;
		curr_node.prev=new_node;
		list.head=new_node;
		
	}
	//Inserting At Particular Index
	public void insertAtIndex(DoubleLinkedList list, int data,int index)
	{
		ListNode new_node=new ListNode(data);
		new_node.prev=null;
		new_node.next=null;
		
		int count=0;
		ListNode curr_node,prev_node=null;
		curr_node=list.head;
		if(index==0)
		{
			new_node.next=curr_node;
			curr_node.prev=new_node;
			list.head=new_node;
			return;
		}
		else
		{
			while(curr_node!=null&&count<index)
			{
				prev_node=curr_node;
				curr_node=curr_node.next;
				count++;
			}
			prev_node.next=new_node;
			new_node.prev=prev_node;
			curr_node.prev=new_node;
			new_node.next=curr_node;
			return;
		}
		
		
	}
	
	//traversing the DoubleLinkedList 
	
	public void printlist(DoubleLinkedList list)
	{
		ListNode curr_node;
		curr_node=list.head;
		System.out.print("Double Linked List fwd Traversal : ");
	
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
	}
	
	//traversing the linked list in backwarddirection
	public void traverseBackwards(DoubleLinkedList list)
	{
		ListNode curr_node=list.head,prev_node = null;
		while(curr_node!=null)
		{
			prev_node=curr_node;
			curr_node=curr_node.next;
		}
		System.out.print("Double Linked List bckwrd Traversal : ");
		
		
		while(prev_node!=null)
		{
			System.out.print(prev_node.data+" ");
			prev_node=prev_node.prev;
		}
	}
	public static void main(String[] args) 
	{
		DoubleLinkedList list=new DoubleLinkedList();
		list.insert(list,4);
		list.insert(list,6);
		list.insertAtBeg(list,3 );
		list.insertAtIndex(list, 5, 2);
		list.insertAtIndex(list, 2, 0);
		list.printlist(list);
		list.traverseBackwards(list);
	}
}
