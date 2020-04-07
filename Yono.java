import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Yono extends Frame implements ActionListener {
     Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
     int arr[]={9,5,7,6,2,1,4,3,0,8};
     String m1= new String();
     TextField t1;
     int state=1;
     Panel p1,p2;

     Yono(){
     t1 = new TextField();
     t1.setPreferredSize(new Dimension(150,30));
     Random rand= new Random();
     int r= rand.nextInt(10);
     for(int i=0;i<10;i++){
          r= rand.nextInt(10);
          int k=(i+r)%10;
          if(search(k)==1)
          arr[i]=k;
          
     }
     p1= new Panel(new FlowLayout(FlowLayout.CENTER));
     p2=new Panel(new GridLayout(4,3));


          
     
     b1= new Button(Integer.toString(arr[1]));
     b2= new Button(Integer.toString(arr[2]));
     b3= new Button(Integer.toString(arr[3]));
     b4= new Button(Integer.toString(arr[4]));
     b5= new Button(Integer.toString(arr[5]));
     b6= new Button(Integer.toString(arr[6]));
     b7= new Button(Integer.toString(arr[7]));
     b8= new Button(Integer.toString(arr[8]));
     b9= new Button(Integer.toString(arr[9]));
     b0= new Button(Integer.toString(arr[0]));
     p2.add(b1);
     p2.add(b2);
     p2.add(b3);
     p2.add(b4);
     p2.add(b5);
     p2.add(b6);
     p2.add(b7);
     p2.add(b8);
     p2.add(b9);
     p2.add(b0);
     p1.add(t1);
     p1.setPreferredSize(new Dimension(300,200));
     p2.setPreferredSize(new Dimension(300,200));
     add(p1,"North");
     add(p2,"South");
     b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          b6.addActionListener(this);
          b7.addActionListener(this);
          b8.addActionListener(this);
          b9.addActionListener(this);
          b0.addActionListener(this);
     setLayout(new FlowLayout(FlowLayout.CENTER));
     setSize(500,500);
     setVisible(true);


     }
     public void actionPerformed(ActionEvent e){
          if(e.getSource()==b1){
               if(state==1)
               m1=m1+Integer.toString(arr[1]);
               t1.setText(m1); 

          }
          else if(e.getSource()==b2){
               if(state==1)
               m1=m1+Integer.toString(arr[2]);
               
               t1.setText(m1);

          }
          else if(e.getSource()==b3){
               if(state==1)
               m1=m1+Integer.toString(arr[3]);
               //else
               t1.setText(m1);

          }
          else if(e.getSource()==b4){
               String s=Integer.toString(arr[4]);
               if(state==1)
               m1=m1+s;
              // else
               t1.setText(m1);

          }
          else if(e.getSource()==b5){
               String s=Integer.toString(arr[5]);
               if(state==1)
               m1=m1+s;
               
               t1.setText(m1);

          }
          else if(e.getSource()==b6){
               String s=Integer.toString(arr[6]);
               if(state==1)
               m1=m1+s;
               //else
               t1.setText(m1);

          }
          else if(e.getSource()==b7){
               String s=Integer.toString(arr[7]);
               if(state==1)
               m1=m1+s;
               
               t1.setText(m1);

          }
          else if(e.getSource()==b8){
               String s=Integer.toString(arr[8]);
               if(state==1)
               m1=m1+s;
               
               t1.setText(m1);

          }
          else if(e.getSource()==b9){
               String s=Integer.toString(arr[9]);
               if(state==1)
               m1=m1+s;
               
               t1.setText(m1);

          }
          else if(e.getSource()==b0){
               String s=Integer.toString(arr[0]);
               if(state==1)
               m1=m1+s;
               
               t1.setText(m1);

          }
     }

     public int search(int a){
          for(int i=0;i<10;i++)
          {
               if(arr[i]==a)
               return 0;
          }
          return 1;

     }

     static public void main(String[]args){
          new Yono();
     }
}