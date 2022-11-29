import javax.swing.*;

public class window extends JFrame   {
    private MyListener events;
    panel pan;
    window(){
        events = new MyListener();
        addKeyListener(events);
        pan = new panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.add(pan);
        this.pack();//for some reason set size is more of a suggestion 
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        events.handleInput();
    }
    
}