import javax.swing.*;
import java.io.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class filehendel  extends JFrame  implements  ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField f1,f2,f4;
    JTextArea fa1;
    JCheckBox c1,c2;
    JRadioButton r1,r2,r3;
    JButton b1,b2;
    JDialog d1,d2;
    JPasswordField f3;
    filehendel(){
      this.setVisible(true);
        d1=new JDialog(this,"jagan",false);
        l1=new JLabel("YOUR NAME:");
        l2=new JLabel("YOUR EMAIL:");
        l3=new JLabel("YOUR PASSWORD:");
        l4=new JLabel("CITY:");
        l5=new JLabel("GENDER:");
        l6=new JLabel("YOUR ADDRESS:");
        l7=new JLabel("YOUR FILE ALREADY EXIST");
        f1=new JTextField(); 
          f2=new JTextField();  
            f4=new JTextField();  
           f3=new JPasswordField();
                fa1=new JTextArea(); 
                r1=new JRadioButton("Male",false);
                r2=new JRadioButton("Female",false);
                r3=new JRadioButton("costom",false);
                 c1= new JCheckBox("Have you filled all",false);
                c2=new JCheckBox("Are you agree with all the condition",false);
                b1=new JButton("submit");
                b2=new JButton("Reset");
                d1.setBounds(800,200,200,100);
                l7.setBounds(20,20,150,20);
                d1.add(l6);
                l1.setBounds(20,10,150,20);
                l2.setBounds(20,40,150,20);
                l3.setBounds(20,70,150,20);
                l4.setBounds(20,100,150,20);
                l5.setBounds(20,130,150,20);
                l6.setBounds(20,160,150,20);
                f1.setBounds(150,10,150,20);
                f2.setBounds(150,40,150,20);
                f3.setBounds(150,70,150,20);
                f4.setBounds(150,100,150,20);
                fa1.setBounds(150,160,200,60);
                c1.setBounds(20,220,200,20);
                c2.setBounds(20,250,300,20);
                r1.setBounds(150,130,100,20);
                r2.setBounds(250,130,100,20);
                r3.setBounds(350,130,100,20);
                b1.setBounds(40,300,80,50);
                b2.setBounds(340,300,80,50);
                d2= new JDialog(this,false);
l8=new JLabel("You Have Submitted Successfully");
d2.add(l8);
d2.setBounds(820,450,250,100);
d2.setLayout(new FlowLayout());
                d1.add(l7);
                this.add(l1);
                this.add(l2);
                this.add(l3);
                this.add(l4);
                this.add(l5);
                this.add(l6);
                this.add(f1);
                this.add(f2);
                this.add(f3);
                this.add(f4);
                this.add(fa1);
                this.add(c1);
                this.add(c2);
                this.add(r1);
                this.add(r2);
                this.add(r3);
                this.add(b1);
                this.add(b2);
 this.setBounds(700,300,490,400);                                
d1.setLayout(null);
this.setLayout(null);
  r1.addActionListener(this);
 r2.addActionListener(this);
  r3.addActionListener(this);
this .setDefaultCloseOperation(EXIT_ON_CLOSE);
 b1.addActionListener(this);
  b2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==r1){
r2.setSelected(false);
r3.setSelected(false);
        }
                if(e.getSource()==r2){
r1.setSelected(false);
r3.setSelected(false);
        }
                if(e.getSource()==r3){
r2.setSelected(false);
r1.setSelected(false);
        }
        if(e.getSource()==b1){
      try ( FileWriter fw = new FileWriter("P:\\my files\\"+f1.getText()+".txt")){
     fw.write(l1.getText()+" "+f1.getText());
fw.write("\n"+l2.getText()+" "+f2.getText());
fw.write("\n"+l3.getText()+" "+f3.getText());
fw.write("\n"+l4.getText()+" "+f4.getText());
fw.write("\n"+l6.getText()+" "+fa1.getText());
if(r1.isSelected()){
fw.write("\n"+l5.getText()+" "+r1.getText());
}
else if(r2.isSelected()){
fw.write("\n"+l5.getText()+" "+r2.getText());
}
else{
fw.write("\n"+l5.getText()+" "+r3.getText());
}
}
   catch(Exception E){
    d1.setVisible(true);
   }
   f1.setText(null);
    f2.setText(null);
    f3.setText(null);
    f4.setText(null);
    fa1.setText(null);
    d2.setVisible(true);
}
if(e.getSource()==b2){
    f1.setText(null);
    f2.setText(null);
    f3.setText(null);
    f4.setText(null);
    fa1.setText(null);
   r1.setSelected(false);
   r2.setSelected(false);
   r3.setSelected(false);
   c1.setSelected(false);
   c2.setSelected(false);
}
}
public static void main(String[] args) {
    new filehendel();
}
    }
