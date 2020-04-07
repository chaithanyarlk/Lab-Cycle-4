import java.awt.*;
import java.awt.event.*;


public class Signals extends Frame implements ActionListener{
     TextField tf;
     Button b1,b2,b3;
     public Signals(){
          tf= new TextField();
          tf.setBounds(50,50,150,20);
          b1=new Button("Stop!");
          b2=new Button("Ready!!");
          b3= new Button("Go!!!");
          b1.setBounds(100,100,75,50);
          b2.setBounds(100,200,75,50);
          b3.setBounds(100,300,75,50);
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          tf.setEditable(false);
          add(tf);
          add(b1);
          add(b2);
          add(b3);
          setSize(500,500);
          setLayout(null);
          setVisible(true);




     }


     // e.getSource() will return the object that is making 
     //Action
     public void actionPerformed(ActionEvent e){
          if(e.getSource()==b1){
               tf.setForeground(Color.red);
               tf.setText("Stop!");
          }
          else if(e.getSource()==b2){
               tf.setForeground(Color.orange);
               tf.setText("Ready!!");
          }
          else if(e.getSource()==b3){
               tf.setForeground(Color.green);
               tf.setText("Go!!!");
          }
     }

     public static void main(String []args){
          new Signals();
     }
}