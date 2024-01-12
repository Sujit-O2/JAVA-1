//import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class jframe_calculator extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JTextField f1,f2;
JLabel l1,l2;
 static float sum=0;
 //JPanel p;
jframe_calculator(){
    JFrame p=new JFrame();
    //JFrame p=new JFrame();
  // p=new JPanel();
    //this.add(p);
    b1=new JButton("+");
     b2=new JButton("-");
      b3=new JButton("*");
       b4=new JButton("/");
       b5=new JButton("%");
        b6=new JButton("=");
        f1=new JTextField();
         f2=new JTextField();
        l1=new JLabel("First NO\\Answer");
        l2=new JLabel("Second NO:");

f1.setBounds(150,60,200,30);    
b1.setBounds(20,200,50,30);
b2.setBounds(90,200,50,30);
b3.setBounds(160,200,50,30);
b4.setBounds(230,200,50,30);
b5.setBounds(300,200,50,30);
b6.setBounds(370,200,50,30);
l1.setBounds(50,60,100,30);
l2.setBounds(50,100,100,30);
 f2.setBounds(150,100,200,30);
        p.add(l1);
        p.add(f1);
       p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(f1);
        p.add(f2);
        p.add(l2);
        p.add(b6);
        b1.addActionListener(this);
         b2.addActionListener(this);
          b3.addActionListener(this);
           b4.addActionListener(this);
            b5.addActionListener(this);
             b6.addActionListener(this);
p.setLayout(null);
    p.setTitle("Calculator");
    p.setBounds(800,400,460,300);
p.setVisible(true);
p.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    @Override
   
    public void actionPerformed(ActionEvent e) {
         sum=Float.parseFloat(f1.getText());
        if(e.getSource()==b1){
sum=sum+Float.parseFloat(f2.getText());
f2.setText(null);
  f1.setText(String.valueOf(sum));
        }
         if(e.getSource()==b2){
           sum=sum-Float.parseFloat(f2.getText()); 
           f2.setText(null);
          f1.setText(String.valueOf(sum));
        }
         if(e.getSource()==b3){
           sum=sum*Float.parseFloat(f2.getText());
           f2.setText(null);
             f1.setText(String.valueOf(sum));
        }
         if(e.getSource()==b4){
            sum=sum/Float.parseFloat(f2.getText());
f1.setText(null);
  f1.setText(String.valueOf(sum));
        }
         if(e.getSource()==b5){
            f1.setText(String.valueOf(sum));
            sum=0;
        }
    }
    public static void main(String[] args) {
        new jframe_calculator();
    }

}