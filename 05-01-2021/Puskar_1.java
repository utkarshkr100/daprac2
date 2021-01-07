import java.util.Scanner;

public class StackWithLinkedList 
{
	//Stack elements defnition
	class ListElement
	{
		int data;
		ListElement next;
		ListElement prev;
		
		public ListElement(int data)
		{
			this.data=data;
		}
		
	}
	ListElement head;
	public void push(StackWithLinkedList stk,int data)
	{
		ListElement new_element =new ListElement(data);
		new_element.next=null;
		new_element.prev=null;
		
		ListElement top=stk.head,prev_element=null;;
		
		if(stk.head==null)
		{
			stk.head=new_element;
			System.out.println("Element with data : "+data+" Pushed & Head Created");
		}
		else
		{
			while(top!=null)
			{
				prev_element=top;
				top=top.next;
			}
			top=new_element;
			prev_element.next=new_element;
			new_element.prev=prev_element;
			System.out.println("Element with data : "+data+" Pushed In");
		}
	}
	public void display(StackWithLinkedList  stk)
	{
		ListElement top=stk.head;
		System.out.print("Now the Stack Is : ");
		while(top!=null)
		{
			System.out.print(top.data+" ");
			top=top.next;
		}
		System.out.println();
	}
	public void pop(StackWithLinkedList  stk)
	{
		ListElement top=stk.head,prev_element=null;
		while(top.next!=null)
		{
			prev_element=top;
			top=top.next;
		}
		
		System.out.println("Element with data : "+top.data+" Poped Out");
		prev_element.next=null;
	}
	public void peek(StackWithLinkedList stk)
	{
		ListElement top=stk.head,prev_element=null;
		while(top.next!=null)
		{
			prev_element=top;
			top=top.next;
		}
		
		System.out.println("Top of the Stack is : "+top.data);
	}
	
	public void size(StackWithLinkedList stk)
	{
		int length=1;
		ListElement top=stk.head,prev_element=null;
		while(top.next!=null)
		{
			top=top.next;
			length++;
		}
		
		System.out.println("The size of  Stack is : "+length);
	}
	public void search(StackWithLinkedList stk,int key)
	{
		ListElement top=stk.head;
		boolean flag=false;
		int index=0;
		while(!flag&&top.next!=null)
		{
			top=top.next;
			index++;
			if(top.data==key)
			{
				flag=true;
			}
			
		}
		if(flag)
		{
			System.out.println("The Key is found at Index :"+index);
		}
		else
		{
			System.out.println("The Key is not found ");
		}
	}
	
	public static void main(String[] args)
	{
		StackWithLinkedList  stk=new  StackWithLinkedList();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		System.out.println("1. Push ");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Display");
		System.out.println("5. Search");
		System.out.println("6. Size");
		System.out.println("7. Exit");
		while(flag)
		{
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter The Element to Be Pushed");
				stk.push(stk, sc.nextInt());break;
			}
			
			case 2 :
			{
				stk.pop(stk);break;
			}
			case 3:
			{
				stk.peek(stk);;break;
			}
			case 4:
			{
				stk.display(stk);;break;
			}
			case 5:
			{
				System.out.println("Enter The Element to Be Seached");
				stk.search(stk, sc.nextInt());;break;
			}
			case 6:
			{
				stk.size(stk);break;
			}
			case 7:
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
