import singlelinkedlist.*;
public class NthNodeFromEnd 
{	
	public void nodefromend(SingleLinkedList list,int n)
	{
		
		//counting the total number of nodes in linked list
		int total_count=0;
		
		singlelinkedlist.SingleLinkedList.ListNode curr_node=list.head;
		while(curr_node!=null)
		{
			curr_node=curr_node.next;
			total_count++;
		}
		curr_node=list.head;
		int count=total_count-n;
		if(count>=0)

		{
			while(count!=0)
			{
				curr_node=curr_node.next;
				count--;
			}
			System.out.println("Node is : "+curr_node.data);
		}
		else
		{
			System.out.println("Node is Not Availabe ");
			
		}
		 
	}
 public static void main(String[] args)
 {
	SingleLinkedList list=new SingleLinkedList();
	list.insert(list, 0);
	list.insert(list, 1);
	list.insert(list, 2);
	list.insert(list, 3);
	list.insert(list, 4);
	list.insert(list, 5);
	list.insert(list, 6);
	list.insert(list, 7);
	list.printList(list);
	NthNodeFromEnd obj=new NthNodeFromEnd();
	System.out.println();
	obj.nodefromend(list, 2);
 }
}
