import java.util.List;

public class DataPoints {
    public class points{
        float x,y;
        points(float x_1, float y_1){
            x = x_1;
            y = y_1;
        }

    }
    public List<points> data;
    public DataPoints(){
        data.add(new points(300, 400));
        data.add(new points(600, 300));

    }
    void pushback(points value){
        data.add(data.size()-1, value);
    }

}
