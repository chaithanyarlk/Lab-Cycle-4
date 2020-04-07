import java.util.*;



class Doublyll{
    private Node head;
     class Node{
          int data;
          Node prev;
          Node next;
     }

     public Doublyll(){
          head=null;

     }
     public boolean insert(int data){
          
          Node  newNode = new Node();
          newNode.data=data;
          newNode.prev=null;
          newNode.next=null;
          if(newNode==null)
          return false;
          Node temp;
          if(head!=null){
               temp=head;
               head=newNode;
               newNode.next=temp;

          }
          head=newNode;

          return true;
          
     }

     public void display(){
          Node temp=head;
          while(temp!=null){
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
               if(temp.prev!=null){
               (temp.prev).next=temp.next;
               (temp.next).prev=temp.prev;
          }
               else
               head=null;
               display();
               return 1;

          }
     }
}

public class Doubly{
     static public void main(String []args){
          Doublyll d= new Doublyll();
          boolean temp=true;
          int choice;
          Scanner s= new Scanner(System.in);
          while(temp){
               System.out.println("1 to insert");
               System.out.println("2 to delete");
               System.out.println("3 to display");
               System.out.println("4 to exit");
               choice=s.nextInt();
               switch(choice){
                    case 1:
                    choice=s.nextInt();
                    if(d.insert(choice));
                    d.display();
                    break;
                    case 2:
                    choice=s.nextInt();
                    choice=d.Delete(choice);
                    if(choice!=-1);
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