import java.util.Scanner;
public class CircularDoubleLinkedList
{
	class ListNode
	{
		int data;
		ListNode next,prev;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	ListNode head;
	public void insert(CircularDoubleLinkedList list,int data)
	{
		ListNode new_node=new ListNode(data);
		new_node.next=null;
		new_node.prev=null;
		if(list.head==null)
		{
			list.head=new_node;
			head.next=new_node;
			head.prev=new_node;
			System.out.println("Node With Data "+data+" Inserted");
			return;
		}
		else
		{
			ListNode curr_node=list.head,prev_node=null;
			while(curr_node.next!=list.head)
			{
				prev_node=curr_node;
				curr_node=curr_node.next;
			}
			new_node.next=list.head;
			
			new_node.prev=curr_node;
			
			curr_node.next=new_node;
			
			(list.head).prev=new_node;
			System.out.println("Node With Data "+data+" Inserted");
			return;
		}
	}
	public void insertAtIndex(CircularDoubleLinkedList list,int data,int index)
	{
		 ListNode curr_node=list.head,prev_node=null,last_node=(list.head).prev;
		 int count=0;
		 
		 ListNode new_node=new ListNode(data);
		 new_node.next=null;
		new_node.prev=null;
		 
		 if(index==0)
		 {
			new_node.prev=last_node;
			last_node.next=new_node;
			curr_node.prev=new_node;
			new_node.next=curr_node;
			list.head=new_node;
		
			 System.out.println("Node With Data "+data+" Inserted At Head");
			 return;
		 }
		 else if(index>count&&curr_node.next!=list.head)
		 {
			 while(index>count&&curr_node.next!=list.head)
			 {
				
				 prev_node=curr_node;
				 curr_node=curr_node.next;
				 count++;
			 }
			 prev_node.next=new_node;
			 new_node.prev=prev_node;
			 new_node.next=curr_node;
			 curr_node.prev=new_node;
			 System.out.println("Node With Data "+data+" Inserted At Position : "+index);
			 return;
		 }
		 
	}
	public void deleteByKey(CircularDoubleLinkedList list,int key)
	{
		ListNode curr_node=list.head,prev_node=null,last_node=(list.head).prev;
		if(list.head.data==key)
		{
		
			curr_node=curr_node.next;
			curr_node.prev=last_node;
			last_node.next=curr_node;
			list.head=curr_node;
			System.out.println("Key :"+key +" Found As Head And Deleted");
			return;
		}
		if(curr_node.next!=list.head&&curr_node.data!=key)
		{
			while(curr_node.next!=list.head&&curr_node.data!=key)
			{
				prev_node=curr_node;
				curr_node=curr_node.next;
			}
			curr_node=curr_node.next;
			prev_node.next=curr_node;
			curr_node.prev=prev_node;
			System.out.println("Key :"+key +" Found In Between The List And Deleted");
		}
	}
	public void printfwd(CircularDoubleLinkedList list)
	{
		ListNode curr_node=list.head;
		System.out.print("CircularDoubleLinkedList : ");
		while(curr_node.next!=list.head)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
		System.out.print(curr_node.data+" ");
		System.out.println();
	}
	public void PrintBckwrd(CircularDoubleLinkedList list)
	{
		ListNode curr_node=list.head;
		System.out.print("CircularDoubleLinkedList BackWard Traversal : ");
		while(curr_node.prev!=list.head)
		{
			curr_node=curr_node.prev;
			System.out.print(curr_node.data+" ");
		}
		curr_node=curr_node.prev;
		System.out.print(curr_node.data+" ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CircularDoubleLinkedList list=new CircularDoubleLinkedList();
		boolean flag=true;
		System.out.println("1. Insert A Node ");
		System.out.println("10. Insert A Node (Data ,Index)");
		System.out.println("2. Delete A Node  ");
		System.out.println("3. Print The Fwd Traversal Of List ");
		System.out.println("4. Print The Backward Traversal Of List ");
		System.out.println("5. Print The Head Node ");
		System.out.println("6. Exit");
		while(flag)
		{
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				list.insert(list, sc.nextInt());break;
			}
			case  10:
			{
				list.insertAtIndex(list, sc.nextInt(),sc.nextInt());break;
			}
			case 2 :
			{
				list.deleteByKey(list,sc.nextInt());break;
			}
			case 3:
			{
				list.printfwd(list);break;
			}
			case 5:
			{
				System.out.println(list.head);break;
			}
			case 4:
			{
				list.PrintBckwrd(list);break;
			}
			case 6:
			{
				flag=false;break;
			}
			default:
			{
				System.out.println("Enter The Correct Output");
			}
			}
		}
		
	}
}
