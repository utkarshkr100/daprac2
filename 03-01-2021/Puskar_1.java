import java.util.Scanner;
 
public class SingleLinkedList 
{	
	// Node Description.
	static class ListNode
	{	
		 int data;
		 ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	//making head;
	ListNode head;
	
	//Insertion At Last
	public void insert(SingleLinkedList list,int data)
	{
		ListNode new_node= new ListNode(data);
		new_node.next=null;
		
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			ListNode curr_node;
			curr_node=list.head;
			while(curr_node.next!=null)
			{
				curr_node=curr_node.next;
			}
			curr_node.next=new_node;
		}
	}
	
	public void insertAtBeg(SingleLinkedList list,int data)
	{
		ListNode new_node=new ListNode(data);
		new_node.next=list.head;
		list.head=new_node;	
	}
	
	//Inserting Node At Some Particular Index
	public void insertAtIndex(SingleLinkedList list,int data,int index)
	{
		ListNode new_node= new ListNode(data);
		new_node.next=null;
		
		ListNode curr_node;
		
		curr_node=list.head;
		int count=0;
		//think why?? index-1 beacuse curr_node is already point head.
		while(count<index-1)
		{
			curr_node=curr_node.next;
			count++;
		}
		new_node.next=curr_node.next;
		curr_node.next=new_node;
		
		
	}
	public void delete(SingleLinkedList list,int Key)
	{
		ListNode curr_node=list.head,prev_node=null;
		
		if(curr_node!=null&&curr_node.data==Key)
		{
			list.head=curr_node.next;
			System.out.println(Key +" Found As Head & Deleted.");
			return;
		}
		if(curr_node!=null&&curr_node.data!=Key)
		{
			while(curr_node!=null&&curr_node.data!=Key)
			{
				prev_node=curr_node;
				curr_node=curr_node.next;
			}
			
			prev_node.next=curr_node.next;
			System.out.println(Key +" Found In Between Linked List & Deleted.");
			return;
		}
		if(curr_node==null)
		System.out.println(Key+" NOT FOUND");
	}
	
	//Deleting At An Index
	
	public void deleteAtIndex(SingleLinkedList list,int index)
	{
		ListNode curr_node,prev_node=null;
		int count=0;
		
		curr_node=list.head;
		
		if(index==0)
		{
			list.head=curr_node.next;
			System.out.println("Head Node Deleted");
			return;
		}
		else if(curr_node!=null&&index>0)
		{
			while(count<index-1)
			{
				
				curr_node=curr_node.next; 
				count++;
			}
			prev_node=curr_node;
			curr_node=curr_node.next;
			prev_node.next=curr_node.next;
			System.out.println("Node deleted At The Index : "+index);
			return;
		}
		else
		{
			System.out.println("Node Not Found ");
			return;
		}
	}
	//Traversing the LinkedList
	public void printList(SingleLinkedList list)
	{
		ListNode curr_node;
		curr_node=list.head;
		System.out.print("Linked List : ");
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SingleLinkedList list=new SingleLinkedList();
		list.insert(list,5);
		list.insert(list,7);
		list.insert(list,8);
		list.insertAtBeg(list, 4);
		list.insertAtIndex(list,6,2);
		list.deleteAtIndex(list, 3 );
		list.printList(list);
		
		//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/-- if in Doubt 
	}
}
