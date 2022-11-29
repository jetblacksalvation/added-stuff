import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener implements KeyListener {
    private double angle = 0;   

    private int angle_right = 0;
    private int angle_left = 1;

    private DataPoints worldData = new DataPoints();


    public boolean [] keys;
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == 'q' || keyCode =='Q'){
            keys[angle_left] = true;
        }
        else{
            keys[angle_left] = false;
        }
        if(keyCode == 'e' || keyCode == 'E'){
            keys[angle_right] = true;
        }
        else{
            keys[angle_right] = false;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
    public MyListener(){
        keys = new boolean[2];//alloctate keys

    }
    private void Rotate(){
        System.out.println(worldData.data.getClass().getName());
        
    };
    public void handleInput(){
        if(keys[angle_left]){
            angle -=0.02f;
        }
        if(keys[angle_right]){
            angle += 0.02f;
        }
        Rotate();
    }

}
