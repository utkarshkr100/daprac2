import java.util.Scanner;
class node{
    int val;
    node next;
    node prev;
    node(int val, node a){
        this.val = val;
        this.next = null;
        this.prev = a;
    }
}
class LinkedList{
    node head = null;
    void insertAtEnd(int val){
        node ptr = head;
        if(ptr == null){
            this.head = new node(val,null);
            return;
        }

        while(ptr.next!=null)
            ptr = ptr.next;
        ptr.next = new node(val, ptr);
    }
    void insertAtBeg(int val){
        node ptr = new node(val,null);
        if(head!=null)
            head.prev = ptr;
        ptr.next = head;
        this.head = ptr;
    }
    void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        node ptr = head;
        while(ptr.next!=null){
            System.out.print(ptr.val+" ");
            ptr = ptr.next;
        }
        System.out.println(ptr.val);

        System.out.println("printing backward: ");
        while(ptr!=null){
            System.out.print(ptr.val+" ");
            ptr = ptr.prev;
        }

    }
    void delAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else if(head.next == null){
            this.head = null;
            return;
        }
        node ptr = head;
        while(ptr.next.next!=null){
            ptr = ptr.next;            
        }
        node temp = ptr;
        temp = temp.next;
        temp.prev = null;
        ptr.next = null;
    }
    void delAtBeg(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else if(head.next == null){
            this.head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
}

public class Utkarsh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int t = 0;
        while(t!= -1){
            System.out.println("\n1. insert from beginning");
            System.out.println("2. insert from end");
            System.out.println("3. delete from beginning");
            System.out.println("4. delete from end");
            System.out.println("5. display");
            System.out.println("6. exit\n");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Enter value");
                    //int val = sc.nextInt();
                    list.insertAtBeg(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value");
                    //int val = sc.nextInt();
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    list.delAtBeg();
                    break;
                case 4:
                    list.delAtEnd();
                    break;
                case 5:
                    System.out.println("Printing list");
                    list.display();
                    break;
                case 6:
                    t = -1;
                    break;
                default:
                    System.out.println("Invalid Input");
            }            
        }
        sc.close();
    }
}
