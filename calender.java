import java.io.*;
import java.util.Calendar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calender implements ActionListener{
Frame f2;
TextField tf1,tf2,tf3;
Label l1,l2,l3,l4,l5;
Button s1,r1;
int year,date,month;
calender(){

f2=new Frame("calendar");
l1=new Label("Enter the Year:");
l2=new Label("Enter the Month:");
l3=new Label("Enter the Date:");
l4=new Label("??DAY??");
tf1=new TextField(4);
tf2=new TextField(2);
tf3=new TextField(2);
s1=new Button("submit");
r1=new Button("RESET");
f2.setBounds(400,40,400,400);
l5=new Label("CLICK START");
l5.setBounds(170,50,100,30);
l1.setBounds(10,50,100,20);
tf1.setBounds(120,50,100,20);
l2.setBounds(10,100,100,20);
tf2.setBounds(120,100,100,20);
l3.setBounds(10,150,100,20);
tf3.setBounds(120,150,100,20);
l4.setBounds(150,200,100,20);
s1.setBounds(250,300,100,20);
r1.setBounds(50,300,100,20);
f2.add(l1);
f2.add(tf1);
f2.add(l2);
f2.add(tf2);
f2.add(l3);
f2.add(tf3);
f2.add(l4);
f2.add(s1);
f2.add(r1);
f2.setLayout(null);
f2.setVisible(true);
s1.addActionListener(this);
r1.addActionListener(this);
}
    public static void main(String[] args)throws IOException {
new calender();



 }

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==s1){
year=Integer.parseInt(tf1.getText());
month=Integer.parseInt(tf2.getText());
date=Integer.parseInt(tf3.getText());
Calendar cc=Calendar.getInstance();
cc.set(year,month-1,date);
int day=cc.get(Calendar.DAY_OF_WEEK);
switch(day){
    case 1:{
    l4.setText("sunday");
    break;}
     case 2:{
    l4.setText("monday");
    break;}
     case 3:{
   l4.setText("tuesday");
    break;}
     case 4:{
    l4.setText("wednesday");
    break;}
    case 5:{
    l4.setText("thursday");
    break;}
    case 6:{
    l4.setText("friday");
    break;}
    case 7:{
     l4.setText("saturday");
    break;}

//}

   }
    }
 }}