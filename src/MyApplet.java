import java.awt.*;
import javax.swing.JApplet;
import java.awt.Font;
import java.awt.Graphics;
public class MyApplet extends JApplet 
{
    public void paint(Graphics g) 
    {
        g.setColor(Color.gray);
        g.fillRect(0,0,1500,1300);
        g.setColor(new Color(238,232,170));
        g.fillRect(0,400,1400,300);
        
        g.setColor(new Color(204,102,0));
        g.fillRect(400,350,15,100);
        g.fillRect(415,435,100,15);
        g.fillRect(400,450,15,100);
        g.fillRect(500,450,15,100);
        
        g.setColor(new Color(153,76,0));
        g.fillRect(410,350,15,90);
        g.fillRect(415,425,100,15);
        
        g.setColor(new Color(204,102,0));
        g.fillRect(910,350,15,100);
        g.fillRect(815,435,110,15);
        g.fillRect(815,450,15,100);
        g.fillRect(910,450,15,100);
        
        g.setColor(new Color(153,76,0));
        g.fillRect(815,420,95,15);
        g.fillRect(895,350,15,80);
         
        g.setColor(new Color(204,0,0));
        g.fillOval(530,410,270,30);
        
        g.setColor(Color.BLACK);
        g.drawLine(540,430,760,550);
        g.drawLine(790,430,560,550);
        
        g.setColor(new Color(204,102,0));
        g.fillRect(543,300,250,100);
        
        g.setColor(new Color(153,76,0));
        g.fillRect(515,290,300,15);
        
        g.setColor(Color.BLACK);
        g.fillRect(655,275,25,15);
        
        g.setColor(Color.BLACK);
        g.fillRect(520,130,300,150);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(530,140,280,130);
        
        g.setColor(new Color(204,102,0));
        g.fillRect(980,100,250,300);
        
         g.setColor(new Color(153,76,0));
         g.fillRect(1100,100,10,300);
         g.fillRect(1070,250,10,30);
         g.fillRect(1100,250,130,10);
         g.fillRect(1100,320,130,10);
         g.fillRect(1150,350,30,10);
         g.fillRect(1150,270,30,10);
         g.fillRect(100,100,200,300);//
         
         g.setColor(new Color(255,215,0));
         g.fillOval(270,270,20,20);
         
         g.setColor(Color.orange);
         g.fillRect(100,420,200,100);
         g.setColor(new Color(204,0,0));
         g.fillRect(105,425,190,90);
          g.setColor(Color.yellow);
          g.setFont(new Font("Times New Roman",Font.BOLD,28));
          g.drawString("WELCOME",120,480);
          
          g.setColor(new Color(102,51,0));
          g.fillRect(1090,500,90,60);
          g.setColor(new Color(0,153,0));
          g.fillOval(1050,440,70,70);
          g.fillOval(1100,400,70,70);
          g.fillOval(1150,440,70,70);
          g.fillOval(1100,440,70,70);
          
          
          
          
           
          
          
         
         
         
        
        
        
        
                
        
        
        
        
        
    }

    
}
