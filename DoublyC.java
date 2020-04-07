import java.util.*;

/* Static inputs of dll are commented at the end of code 
if required please insert them in the code to verify
this below code is for implementation any number of operations */

class Doublyll{
    public Node head;
     class Node{
          int data;
          Node prev;
          Node next;
     }

     public Doublyll(){
          head=null;

     }
     public Node search(int data){
          Node temp=head;
          while(temp!=null&& temp.data!=data){
               temp=temp.next;
          }
          return temp;
     }
     public boolean insert(int data,Node ptr,int n){
          
          Node  newNode = new Node();
          newNode.data=data;
          newNode.prev=null;
          newNode.next=null;
          if(newNode==null)
          return false;
          if(ptr==null){
               Node temp;
               if(head!=null&&n==0){
                    temp=head;
                    head=newNode;
                    newNode.next=temp;
                    newNode.prev=temp.prev;

               }
               else if(head!=null&&n==1){
                    temp=head.prev;
                    temp.next=newNode;
                    newNode.next=head;
                    newNode.prev=temp;

               }
               else{
                    head=newNode;
                    head.next=head;
                    head.prev=head;
               }
          
          }

          else{
               newNode.next=ptr.next;
               ptr.next=newNode;
               newNode.prev=ptr;
               (newNode.next).prev=newNode;
          }
          return true;
          
     }

     public void display(){
          Node temp=head;
          System.out.println(head.data);
          temp=temp.next;
          while(temp.next!=head){
               System.out.println(temp.data);
               temp=temp.next;

          }
     }
     public int Delete(int data){
          Node temp=head;
          if(temp==null)
          return -1;
          while(temp!=null&&temp.data!=data){
               temp=temp.next;
          }
          if(temp==null)
          return -1;
          else{
               if(temp.prev!=temp){
                    (temp.prev).next=temp.next;
                    (temp.next).prev=temp.prev;}
               else
               head=null;
               display();
               return 1;

          }
     }
     public int ret(Node hea){
          return hea.data;
     }
     public int ret1(Node h){
          return (h.prev).data;
     }
}

public class DoublyC{
     public static void main(String []args){

          Doublyll d= new Doublyll();
          boolean temp=true;
          int choice;
          int data;
          int n;
          
          Scanner s= new Scanner(System.in);
          while(temp){
               System.out.println("1 to insert");
               System.out.println("2 to delete");
               System.out.println("3 to display");
               System.out.println("4 to exit");
               choice=s.nextInt();
               switch(choice){
                    case 1:
                    data=s.nextInt();
                    System.out.println("if you want to insert after something then eneter 1 then data point : ");
                    choice=s.nextInt();
                    if(choice==1){
                    choice=s.nextInt();
                    if(d.insert(data, d.search(choice), 0))
                    d.display();                    
               }
               else{
                    System.out.println("Enter 0 if starting insert else 1");

                    n=s.nextInt();
                    if(n==0){
                         if(d.insert(data, null, n))
                         d.display();
                    }
                    else{
                         if(d.insert(data, null, 1))
                         d.display();
                    }

               }
                    break;
                    case 2:
                    System.out.println("enetr 1 to delete at starting 2 to end and 3 to delete specific");
                    choice=s.nextInt();
                    if(choice==1){
                         d.Delete(d.ret(d.head));

                    }
                    else if(choice==2){
                         d.Delete(d.ret1(d.head));
                    }
                    else{
                         choice=s.nextInt();
                         d.Delete(choice);
                    }
                    
                    d.display();
                    break;
                    case 3:
                    d.display();
                    break;
                    case 4:
                    temp=false;
                    break;
                    default:
                    System.out.println("Enter a proper choice");
               }

               
          }

     }
}
/*d.insert(66,null,0);
d.insert(33,null,0);
d.insert(4,null,0);
d.insert(59,null,0);
d.insert(9,null,0);
d.insert(8,null,0);
d.insert(1,null,0);
d.insert(5,null,0);
d.insert(2,null,0);
d.Delete(2);
d.Delete(8);














*/