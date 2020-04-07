import java.awt.*;
import java.awt.event.*;

public class Divider extends Frame implements ActionListener{
     TextField t1,t2,t3;
     Button b;
     Label l1,l2,l3;
     public Divider(){
     l1= new Label("Number 1");
     l2=new Label("Number 2");
     l3= new Label("Result");
     t1=new TextField();
     t2=new TextField();
     t3= new TextField();
     b= new Button("Divide");
     l1.setBounds(100,50,100,50);
     t1.setBounds(200,50,100,30);
     l2.setBounds(100,200,100,50);
     t2.setBounds(200,200,100,30);
     b.setBounds(100,300,75,20);
     l3.setBounds(100,400,100,50);
     t3.setBounds(200,400,100,30);
     t3.setEditable(false);
     t3.setBackground(Color.white);
     add(t1);
     add(t2);
     add(t3);
     add(l1);
     add(l2);
     add(l3);
     add(b);
     b.addActionListener(this);
     setSize(500,500);
     setLayout(null);
     setVisible(true);



     }
     public void actionPerformed(ActionEvent e){
          if(e.getSource()==b){
               int num1=Integer.parseInt(t1.getText());
               int num2=Integer.parseInt(t2.getText());
               double num3;
               if(num2!=0){
                    num3=(double)num1/num2;
                    String res =String.valueOf(num3);
                    t3.setText(res);
                                  
               }
               else{
                    t3.setText("Airthematic Exception Occured!");
               }
               
          }
     }

     static public void main(String []args){
          new Divider();
     }



}