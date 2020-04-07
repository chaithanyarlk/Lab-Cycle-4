import java.util.*;
import java.util.Random;

class Square extends Thread{
     int n;
     public Square(int n){
          
          this.n=n;
          System.out.println("Square is : "+n*n);

     }
     

     
}
class Cube extends Thread{
     int n;
     public Cube(int n){
          this.n=n;
          System.out.println("Cube is : "+n*n*n);

     }
    


}
class Dummy extends Thread{

     public void run(){
          Random rand =new Random();
          for(int i=0;i<10;i++){
               int r= rand.nextInt(10);
               System.out.println("Random num is :"+r);
               if(r%2==0){
                    Square s= new Square (r);
                    s.start();
                    
               }
               else{
                    Cube c= new Cube(r);
                    c.start();
                    
               }

               try{
                    Thread.sleep(1000);
               }
               catch(InterruptedException ex){
                    System.out.println(ex);
               }

          }
}}

public class Threading{
     public static void main(String[]args){
          Dummy d= new Dummy();
          d.start();
     }
}