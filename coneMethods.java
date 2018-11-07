
public class coneMethods{
    
    
    public double slantHeight(double radius, double height){
        double slantHeight = Math.sqrt((radius*radius)+(height*height));
        return slantHeight;
    }

    public double angle(double radius, double height){
        double theta = Math.atan(radius/height);
        return theta;
    }
}