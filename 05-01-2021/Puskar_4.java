//not found case not implemented
import singlelinkedlist.*;
import singlelinkedlist.SingleLinkedList.ListNode;
public class NthNodeFromEndByRecurrsive
{
	int count=0;
	boolean flag=false;
	public void nthNodeFromEnd(SingleLinkedList list,ListNode curr_node,int n)
	{
		if(curr_node!=null)
		{
			nthNodeFromEnd(list,curr_node.next,n);
			count++;
			
			if(count==n)
			{
				flag=true;
				System.out.println("Node is : "+curr_node.data);
				return;
			}
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
		NthNodeFromEndByRecurrsive obj=new NthNodeFromEndByRecurrsive();
		System.out.println();
		singlelinkedlist.SingleLinkedList.ListNode curr_node;
		curr_node=list.head;
		obj.nthNodeFromEnd(list,curr_node,10);
	}
}
