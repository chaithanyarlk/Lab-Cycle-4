class ll{
     public Node head;
     class Node{
          private int data;
          private Node next;
     }

     public void insert(int data,Node ptr){
          Node newNode =new Node();
          newNode.data=data;
          newNode.next=null;
          if(ptr==null){
               if(head==null)
               head=newNode;
               else{
                    Node temp=head;
                    head=newNode;
                    head.next=temp;
               }

          }
          else{
               Node temp=ptr.next;
               ptr.next=newNode;
               newNode.next=temp;
          }

     }
     public void display(){
          Node temp=head;
          while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
          }
     }

     public void inserter(ll l2){
          Node h= l2.head;
          int i=1;
          Node temp =head;
          while(temp!=null){
               if(i%2==1){
                    Node ptr=temp;
                    insert(h.data,ptr);
                    h=h.next;
               }
               i++;
               temp=temp.next;

          }
     }




}

public class Linked{
     static public void main(String[]args){
          ll l1= new ll();
          ll l2= new ll();
          l1.insert(5, null);
          l2.insert(5,null);
          l1.inserter(l2);
          l1.display();
          

     }
}
