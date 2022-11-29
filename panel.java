import java.awt.*;
import javax.swing.*;

public class panel extends JPanel  {
    
    float angle = 0;
    
    float x,y;    
    
    panel(){
        this.setPreferredSize(new Dimension(800,800));//this function is stupid 
    }   
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;//for somereason it's legal to cast classes? 
        g2d.drawLine(0,0,500,500);
    }
}
