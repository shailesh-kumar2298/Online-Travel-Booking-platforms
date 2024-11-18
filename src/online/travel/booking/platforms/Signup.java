package online.travel.booking.platforms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    Signup (){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        add(p1);
        p1.setLayout(null);
        add(p1);
        JLabel lbLusername=new JLabel("Username");
        lbLusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lbLusername.setBounds(50,20,125,25);
        p1.add(lbLusername);
         tfusername=new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        JLabel lbname=new JLabel("Name");
        lbname.setFont(new Font("Tahoma",Font.BOLD,14));
        lbname.setBounds(50,60,120,25);
        p1.add(lbname);
         tfname=new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lbLpassword=new JLabel("Password");
        lbLpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        lbLpassword.setBounds(50,100,125,25);
        p1.add(lbLpassword);
         tfpassword=new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        JLabel lblSecurityQuestion = new JLabel("Security Question ");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(50, 140, 125, 25);
	p1.add(lblSecurityQuestion);
         security =new Choice();
        security.add(" which type of area you ");
        security.add("fav Marvel superhero");
        security.add("Your lucky number");
        security.add("Your chilhood superhero");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        JLabel lblanswer=new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        lblanswer.setBounds(50,180,125,25);
        p1.add(lblanswer);
       
        tfanswer=new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
         create=new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("Tohoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
         back=new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tohoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create ){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password=tfpassword.getText();
            String question = security.getSelectedItem();
            String  answer=tfanswer.getText();
            String query = "insert into accounts values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
            Conn c = new Conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "account created successfully");
            setVisible(false);
            new Login();
            }
            catch(Exception e){
            e.printStackTrace();}
        }
        else if(ae.getSource() == back){
        setVisible(false);
        new Login ();
        }
    }

    


    public static void main(String[] args) {
        new Signup ();
        
    }
}
    