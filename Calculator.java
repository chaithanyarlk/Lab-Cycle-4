import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/* Important dont use keyboard to enter any character
*/

public class Calculator extends Frame implements ActionListener {
     Panel p1, p2;
     String m1 = new String();
     String s2 = new String();
     String s1 = new String();

     int state = 0;
     TextField t1;
     Label l1, l2, l3;
     Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b11, b12, b13, b14, b15, enter;

     Calculator() {
          s2 = s1;
          t1 = new TextField();
          t1.setSize(150, 50);
          // t2=new TextField();
          // t3= new TextField("",150,50);
          // t3.setEditable(false);
          l1 = new Label("Number1");
          // l2= new Label("Number2");
          // l3=new Label("Result");
          p1 = new Panel();
          p2 = new Panel();
          p2.setFont(new Font("Verdana",Font.BOLD,20));
          p1.setFont(new Font("Verdana",Font.BOLD,20));

          p1.setLayout(new GridLayout(3, 5));
          p2.setLayout(new FlowLayout(FlowLayout.CENTER));
          p1.setPreferredSize(new Dimension(200, 200));
          p2.setPreferredSize(new Dimension(300, 200));
          t1.setPreferredSize(new Dimension(150, 30));
          b1 = new Button("1");
          b2 = new Button("2");
          b3 = new Button("3");
          b4 = new Button("4");
          b5 = new Button("5");
          b6 = new Button("6");
          b7 = new Button("7");
          b8 = new Button("8");
          b9 = new Button("9");
          b0 = new Button("0");
          b11 = new Button("+");
          b12 = new Button("-");
          b13 = new Button("*");
          b14 = new Button("/");
          b15 = new Button(".");
          enter = new Button("Enter");
     
          // t1.setBounds("",150,50);
          p1.add(b1);
          p1.add(b2);
          p1.add(b3);
          p1.add(b4);
          p1.add(b5);
          p1.add(b6);
          p1.add(b7);
          p1.add(b8);
          p1.add(b9);
          p1.add(b0);
          p1.add(b11);
          p1.add(b12);
          p1.add(b13);
          p1.add(b14);
          p1.add(b15);
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
          b11.addActionListener(this);
          b12.addActionListener(this);
          b13.addActionListener(this);
          b14.addActionListener(this);
          b15.addActionListener(this);
          enter.addActionListener(this);
          t1.addActionListener(this);
          // t2.addActionListener(this);
          p2.add(l1);
          p2.add(t1);
          // p2.add(l2);
          // p2.add(t2);
          // p2.add(l3);
          // p2.add(t3);
          p2.add(enter);
          add(p1, "Center");
          add(p2, "North");
          this.setSize(1000, 500);
          setVisible(true);

     }

     

     public void actionPerformed(ActionEvent e) {
          // String m1=new String(),m2=new String();

          {
               state = 1;
          }

          if (e.getSource() == b1) {
               if (state == 1)
                    m1 = m1 + "1";
               t1.setText(m1);

          } else if (e.getSource() == b2) {
               if (state == 1)
                    m1 = m1 + "2";

               t1.setText(m1);

          } else if (e.getSource() == b3) {
               if (state == 1)
                    m1 = m1 + "3";
               // else
               t1.setText(m1);

          } else if (e.getSource() == b4) {
               String s = "4";
               if (state == 1)
                    m1 = m1 + s;
               // else
               t1.setText(m1);

          } else if (e.getSource() == b5) {
               String s = "5";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b6) {
               String s = "6";
               if (state == 1)
                    m1 = m1 + s;
               // else
               t1.setText(m1);

          } else if (e.getSource() == b7) {
               String s = "7";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b8) {
               String s = "8";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b9) {
               String s = "9";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b0) {
               String s = "0";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          }

          else if (e.getSource() == b11) {

               String s = "+";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b12) {
               String s = "-";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b13) {
               String s = "*";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b14) {
               String s = "/";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == b15) {
               String s = ".";
               if (state == 1)
                    m1 = m1 + s;

               t1.setText(m1);

          } else if (e.getSource() == enter) {
               /*
                * s1 = t1.getText(); double d= (double)evaluate(s1); if(d!=1012354652){
                * if(s1!=s2) t1.setText(String.valueOf(d)); s1=""; m1=" ";}
                */
               ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
               ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
               try {
                    
                    Object ob = scriptEngine.eval(t1.getText());
                    t1.setText(String.valueOf(ob));
                    m1=" ";
                    
               } catch (ScriptException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    t1.setText("Error");
                    m1=" ";
               }
      
          }

          
          
     }

     static public void main(String []args){
          new Calculator();
     }
}
