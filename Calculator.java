import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calci implements ActionListener
{
     JFrame frame;
     Container c;
     JTextField txt;
     JButton add,sub,mul,div,per,eq,dot,pi,ze,ac,bs,one,two,three,four,five,six,seven,eight,nine;
     double a,b,t,p=3.14;
     char op;
     
   Calci()
   { 

        frame=new JFrame("Calculator");
        c=frame.getContentPane();
        c.setLayout(null);
   
        txt=new JTextField();
        Font f=new Font("Comic Sans MS",Font.ITALIC,25);
        txt.setFont(f);
  
        per=new JButton("%");
        ac=new JButton("AC");
        bs=new JButton("BS");
        eq=new JButton("=");
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        add=new JButton("+");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        sub=new JButton("-");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        div=new JButton("/");
        pi=new JButton("pi");
        ze=new JButton("0");
        dot=new JButton(".");
        mul=new JButton("X");

        txt.setBounds(20,20,320,80);
        per.setBounds(20,100,80,50);
        ac.setBounds(100,100,80,50);
        bs.setBounds(180,100,80,50);
        eq.setBounds(260,100,80,50);

       one.setBounds(20,150,80,50);
        two.setBounds(100,150,80,50);
        three.setBounds(180,150,80,50);
        add.setBounds(260,150,80,50);

       four.setBounds(20,200,80,50);
        five.setBounds(100,200,80,50);
        six.setBounds(180,200,80,50);
        sub.setBounds(260,200,80,50);

       seven.setBounds(20,250,80,50);
        eight.setBounds(100,250,80,50);
        nine.setBounds(180,250,80,50);
        div.setBounds(260,250,80,50);

        pi.setBounds(20,300,80,50);
        ze.setBounds(100,300,80,50);
        dot.setBounds(180,300,80,50);
        mul.setBounds(260,300,80,50);
       
        eq.setFont(f);
        ac.setFont(f);
        bs.setFont(f);
        per.setFont(f);
        one.setFont(f);
        two.setFont(f);
        three.setFont(f);
        add.setFont(f);
        four.setFont(f);
        five.setFont(f);
        six.setFont(f);
        sub.setFont(f);
        seven.setFont(f);
        eight.setFont(f);
        nine.setFont(f);
        div.setFont(f);
        pi.setFont(f);
        ze.setFont(f);
        dot.setFont(f);
        mul.setFont(f);
       

        c.add(txt);
        c.add(per);
        c.add(ac);
        c.add(bs);
        c.add(eq);
        c.add(one);
        c.add(two);
        c.add(three);
        c.add(add);
        c.add(four);
        c.add(five);
        c.add(six);
        c.add(sub);
        c.add(seven);
        c.add(eight);
        c.add(nine);
        c.add(div);
        c.add(pi);
        c.add(ze);
        c.add(dot);
        c.add(mul);
       
        eq.addActionListener(this);
        ac.addActionListener(this);
        bs.addActionListener(this);
        per.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        pi.addActionListener(this);
        dot.addActionListener(this);
        ze.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
       
        c.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,50,370,410);

   }

    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==one)
          txt.setText(txt.getText()+"1");
        if(e.getSource()==two)
          txt.setText(txt.getText()+"2");
       if(e.getSource()==three)
          txt.setText(txt.getText()+"3");
       if(e.getSource()==four)
          txt.setText(txt.getText()+"4");
       if(e.getSource()==five)
          txt.setText(txt.getText()+"5");
       if(e.getSource()==six)
          txt.setText(txt.getText()+"6");
       if(e.getSource()==seven)
          txt.setText(txt.getText()+"7");
       if(e.getSource()==eight)
          txt.setText(txt.getText()+"8");
       if(e.getSource()==nine)
          txt.setText(txt.getText()+"9");
       if(e.getSource()==ze){
          txt.setText(txt.getText()+"0");
       }
       if(e.getSource()==dot){
          txt.setText(txt.getText()+".");
       }
       if(e.getSource()==add)
         {
           a=Float.parseFloat(txt.getText());
           txt.setText("");       
           op='+';
         }
       if(e.getSource()==sub)
         {
           a=Float.parseFloat(txt.getText());
           txt.setText("");       
           op='-';
         }
       if(e.getSource()==mul)
         {
           a=Float.parseFloat(txt.getText());
           txt.setText("");       
           op='*';
         }
       if(e.getSource()==div)
         {
           a=Float.parseFloat(txt.getText());
           txt.setText("");       
           op='/';
         }
       if(e.getSource()==per)
         {
           a=Float.parseFloat(txt.getText());
           txt.setText("");       
           op='%';
         }
        if(e.getSource()==pi)
         {
           txt.setText(""+p);  
         }
       if(e.getSource()==eq)
        {
           b=Double.parseDouble(txt.getText());
          //txt.setText("");       
           switch(op)
           {
             case '+':t=a+b;
                      txt.setText(""+t);
                      break;
             case '-':t=a-b;
                      txt.setText(""+t);
                      break;
             case '*':t=a*b;
                      txt.setText(""+t);
                      break;
             case '/':t=a/b;
                      txt.setText(""+t);
                      break;
             case '%':t=(a*100)/b;
                      txt.setText(""+t);
                      break;
    
           }
        }

         if(e.getSource()==ac)
            txt.setText("");
         if(e.getSource()==bs)
          {
             String s=txt.getText();
             int x=s.length()-1;
             s=s.substring(0,x);
             txt.setText(""+s);
          }       

    }

}

class Calculator
{
  public static void main(String []args)
  {
   Calci ob=new Calci();
  }
}