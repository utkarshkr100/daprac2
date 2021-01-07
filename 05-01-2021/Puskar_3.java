import singlelinkedlist.*;
public class NthNodeFromEndWithTwoPointers 
{	public void nodefromend(SingleLinkedList list,int n)
	{
		singlelinkedlist.SingleLinkedList.ListNode nth_node=list.head,last_node=list.head;
		int count=0;
		while(last_node!=null&&count<=n)
		{
			last_node=last_node.next;
			count++;
		}
		if(last_node!=null)
		{
			while(last_node.next!=null)
				{
					last_node=last_node.next;
					nth_node=nth_node.next;
				}
			System.out.println("Node is : "+nth_node.data);
			
		}
		else
		{
			System.out.println("No Node Exits");
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
		obj.nodefromend(list, 3);
	}
}
