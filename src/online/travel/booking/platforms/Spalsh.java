
package online.travel.booking.platforms;
import javax.swing.*;
import java.awt.*;


public class Spalsh extends JFrame{
    Spalsh(){
      //  setSize(1200,600);
      //  setLocation(200,100);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        setVisible(true);
        
    }
    public static void main(String[]args){
        Spalsh frame = new Spalsh();
        for(int i=1;i<=500;i++){
            frame.setLocation(100,100);
            frame.setSize(1200,600);
        }
    }
    
}
