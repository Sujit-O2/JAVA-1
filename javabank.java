
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class javabank implements ActionListener{
    String row1[]={"amount","status","date"};
    String row[][]=new String[100][3];
    String bb;
    long Total=0;
    Calendar c;
    JFrame f1,f2,f3,f4;
    JLabel l1,l12,l13,l11,l2,l21,l22,l23,l24,l3,l31,l4,l5,l51,l6,l61,l7,l8,l9,l91,l92,l93;
    JDialog d1,d2,d3,d4,d5,d6,d7,d71;
    File f;
    JTextField t1,t2,t3,t31,t4;
    JPasswordField p1,p2,p3,p4,p5,p6;
    JButton b1,b2,b3,b4,b5,b6,b61,b62,b63,b11,b12,b13,b14,b15,b31;
    JTable ta1;
    JScrollPane sc;
    javabank(){
        //lable
   l1=new JLabel("Name:");
   l12=new JLabel("Name:");
   l11=new JLabel("ID no:");
   l13=new JLabel("ID no:");
   l2= new JLabel("Password:");
   l21= new JLabel("Password:");
   l22= new JLabel("Password:");
   l23= new JLabel("Password:");
   l24= new JLabel("Password:");
   l3=new JLabel("Diposite:");
   l4=new JLabel("Withdraw:");
   l5=new JLabel("Total Balence:");
   l51=new JLabel("Total Balence:");
   l6= new JLabel("Enter the amount:");
   l61= new JLabel("Enter the amount:");
   l7=new JLabel("---");
   l8=new JLabel("---");
   l9=new JLabel("-");
   l91=new JLabel("diposite is sucessful");
   l92=new JLabel("withdraw is sucessful");
   l93=new JLabel("withdraw is unsucessful");
   l31=new JLabel("passward is incorrect");
   //text
   t1=new JTextField(null,15);
   t2=new JTextField(null,8);
   t3=new JTextField("0");
   t31=new JTextField("0");
   //password
   p1=new JPasswordField(null,8);
   p2=new JPasswordField(null,8);
   p3=new JPasswordField(null,8);
   p4=new JPasswordField(null,8);
   p5=new JPasswordField(null,8);
   p6=new JPasswordField(null,8);
   //button
    b1=new JButton("Diposite");
    b2=new JButton("withdraw");
    b3=new JButton("total balence");
    b4=new JButton("history");
    b5=new JButton("Submit");
    b6=new JButton("Submit");
    b61=new JButton("Submit");
    b62=new JButton("Submit");
    b63=new JButton("Submit");
    b11=new JButton("OK");
    b12=new JButton("OK");
    b13=new JButton("OK");
    b14=new JButton("OK");
    b15=new JButton("OK");
    b31=new JButton("ok");
    //f1 frame
    f1=new JFrame("logIn");
    f1.setLayout(null);
    l1.setBounds(120,20,100,20);
    t1.setBounds(200,20,150,20);
    l11.setBounds(120,50,100,20);
    t2.setBounds(200,50,150,20);
    l2.setBounds(120,80,100,20);
    p1.setBounds(200,80,150,20);
    b5.setBounds(200,200,100,40);
    f1.setBounds(500,50,500,500);
    f1.add(l1);
    f1.add(t1);
    f1.add(l11);
    f1.add(t2);
    f1.add(l2);
    f1.add(p1);
    f1.add(b5);
    f1.setVisible(true);
    //End of f1
    //f2 starts
    f2=new JFrame("<bank account>");
    f2.setLayout(null);
    l12.setBounds(120,20,100,20);
    l7.setBounds(200,20,150,20);
    l13.setBounds(120,50,100,20);
    l8.setBounds(200,50,150,20);
    l51.setBounds(120,80,100,20);
    l9.setBounds(200,80,150,20);
    b11.setBounds(200,200,100,40);
     f2.add(l12);
     f2.add(l13);
     f2.add(l7);
     f2.add(l8);
     f2.add(l51);
     f2.add(l9);
     f2.add(b11);
    f2.setBounds(500,50,500,500);
    //f3 frame
    f3=new JFrame("what you want"); 
     f3.setLayout(new GridLayout(2,2));
    f3.add(b1);
    f3.add(b2);
    f3.add(b3);
    f3.add(b4);
    //d1 starts
    d1=new JDialog(f3,"diposite",true);
    d1.setBounds(500,250,300,150);
    d1.setLayout(null);
    l6.setBounds(10,10,100,20);
    t3.setBounds(120,10,100,20);
    l21.setBounds(10,30,100,20);
    p3.setBounds(120,30,100,20);
    b62.setBounds(80,60,80,20);
    d1.add(l6);
    d1.add(t3);
    d1.add(l21);
    d1.add(p3);
    d1.add(b62);
    //DIALOG D2
    d2=new JDialog(f3,"withdraw");
    d2.setBounds(500,250,300,150);
    d2.setLayout(null);
    l61.setBounds(10,10,100,20);
    t31.setBounds(120,10,100,20);
    l22.setBounds(10,30,100,20);
    p4.setBounds(120,30,100,20);
    b61.setBounds(80,60,80,20);
    d2.add(l61);
    d2.add(t31);
    d2.add(l22);
    d2.add(p4);
    d2.add(b61);
    //Dialog d3
    d3=new JDialog(f3,"total balence");
    d3.setBounds(500,250,400,100);
    d3.setLayout(new FlowLayout(10));
    d3.add(l23);
    d3.add(p5);
    d3.add(b6);
    //end
    //history
    d4=new JDialog(f3,"history");
    d4.setBounds(500,250,400,100);
    d4.setLayout(new FlowLayout(10));
  d4.add(l24);
  d4.add(p6);
  d4.add(b63);
    //end
    //d5
    d5=new JDialog(d1,"diposite is sucessful");
    d5.setBounds(500,250,400,100);
    d5.setLayout(new FlowLayout(100,20,20));
      d5.add(l91);
      d5.add(b13);
      //d6
      d6=new JDialog(f3," sucessful");
      d6.setBounds(500,250,400,100);
      d6.setLayout(new FlowLayout(100,20,20));
        d6.add(l92);
        d6.add(b14);  
        //d71
         d71=new JDialog(f3,"warning");
          d71.setBounds(500,250,400,100);
          d71.setLayout(new FlowLayout(100,20,20));
          d71.add(l31);
          d71.add(b31);
        //d7
        d7=new JDialog(f3," unsucessful");
        d7.setBounds(500,250,400,100);
        d7.setLayout(new FlowLayout(100,20,20));
          d7.add(l93);
          d7.add(b15);
    
  f3.setBounds(500,50,500,500);
  //d4
  
    //f4  frame
    f4=new JFrame("History");
    f4.setLayout(null);
    ta1=new JTable(row,row1);
     ta1.setBounds(50,50,400,400);
     sc=new JScrollPane(ta1);
     sc.setBounds(10,10,480,300);
     sc.setVisible(true);
     b12.setBounds(200,350,80,30);
      f4.add(sc);
      f4.add(b12);
      f4.setBounds(500,50,500,500);

  //END F4
   b1.addActionListener(this);
   b4.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b11.addActionListener(this);
   b12.addActionListener(this);
   b13.addActionListener(this);
   b14.addActionListener(this);
   b15.addActionListener(this);
   b61.addActionListener(this);
   b62.addActionListener(this);
   b63.addActionListener(this);
   b31.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
       bb=p1.getText();
    if(e.getSource()==b5){
     
      f3.setVisible(true);
      f1.setVisible(false);
      
    }
    if(e.getSource()==b1){
d1.setVisible(true);
    }
    if(e.getSource()==b2){
    d2.setVisible(true);  
    }
    if(e.getSource()==b3){
      d3.setVisible(true);
    }
    if(e.getSource()==b4){
      d4.setVisible(true);
    }
    if(e.getSource()==b62){
      if(bb.equals(p3.getText())){
      Total=Total+Long.parseLong(t3.getText());
     d5.setVisible(true);
      }
      else{
      // d71.setVisible(true);
      }
    }
    if(e.getSource()==b61){
      if(bb.equals(p4.getText())){
        if(Total>=Long.parseLong(t3.getText())){
          Total=Total-Long.parseLong(t3.getText());
           d6.setVisible(true);
        }
    else{
      d7.setVisible(true);
    }}
    else{
      d71.setVisible(true);
    }
  }
    if(e.getSource()==b13){
      d5.setVisible(false);
      d1.setVisible(false);
   }
    if(e.getSource()==b14){
      d6.setVisible(false);
      d2.setVisible(false);
    }
    if(e.getSource()==b15){
      d7.setVisible(false);
      d2.setVisible(false);
   }
    if(e.getSource()==b6){
      if(bb.equals(p5.getText())){
        l7.setText(t1.getText());
        l8.setText(t2.getText());
        l9.setText(String.valueOf(Total)+" $");
    f2.setVisible(true);
    d3.setVisible(false);}
    else{
      d71.setVisible(true);
    }

   }
    if(e.getSource()==b63){
      if(bb.equals(p6.getText())){
      f4.setVisible(true);
      d4.setVisible(false);}
      else{
        d71.setVisible(true);
      }
    }
    if(e.getSource()==b31){
     d71.setVisible(false);
    }
    }
public static void main(String[] args) {
    javabank aa=new javabank();
}

}