import java.util.*;
 
class Minheap{
    private int arr[];
    private int size;
    private int max;

    public Minheap(int max){
         arr=new int[max];
         this.max=max;
         size=0;

    }
    private int parent(int i){
         return i/2;
    }
    private int left(int i){
         return 2*i;
    }
    private int right(int i){
         return (2*i)+1;
    }

    public boolean insert(int val){
         if(size==max-1)
         return false;
         size++;
         arr[size]=val;
         int i=size;
         while(arr[parent(i)]>arr[i]&& i!=1){
              int temp=arr[i];
              arr[i]=arr[parent(i)];
              arr[parent(i)]=temp;
              i=parent(i);
         }
         return true;
    }
    public void display(){
         for(int i=1;i<=size;i++){
              System.out.println(arr[i]);
         }
    }

    private void Minheapify(int i){
         if(size!=0){
              int c1,c2;
              c1=left(1);
              c2=right(i);
              if(c1<size&&c2<size){
                   if(arr[i]>arr[c1]||arr[i]>arr[c2]){
                        if(arr[c1]<arr[c2]){
                             int temp=arr[i];
                             arr[i]=arr[c1];
                             arr[c1]=arr[i];
                             Minheapify(c1);
                        }
                        else{
                             int temp=arr[i];
                             arr[i]=arr[c2];
                             arr[c2]=arr[i];
                             Minheapify(c2);
                        }
                   }
              }
         }

    }
    public int extractMin(){
         if(size==0)
         return -1;
         int val=arr[1];
         arr[1]=arr[size];
         size--;
         Minheapify(1);
         return val;
    }



}


public class Heapmin{
    public static void main(String[]args){
         int max;
         Scanner s= new Scanner(System.in);
         System.out.println("enetr max :");
         max=s.nextInt();
         Minheap h= new Minheap(max);
         boolean temp=true;
         int choice;
         while(temp){
              System.out.println("1 to insert");
              System.out.println("2 to pop");
              System.out.println("3 to display");
              System.out.println("4 to exit");
              choice=s.nextInt();
              switch(choice){
                   case 1:
                   choice=s.nextInt();
                   if(h.insert(choice)){
                        h.display();
                   }
                   else{
                        System.out.println("Cannot do this!");
                   }
                   break;
                   case 2:
                   choice=h.extractMin();
                   if(choice==-1)
                   System.out.println("Cannot do this!");
                   else
                   System.out.println(choice);
                   break;
                   case 3:
                   h.display();
                   break;
                   case 4:
                   temp=false;
                   break;
                   default:
                   System.out.println("Enter the correct choice!");


              }
         }
    }
}