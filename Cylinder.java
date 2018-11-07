public class Cylinder{
    
    double radius;
    double height;
    
    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    private void setRadius(double radius){
        this.radius = radius;
    }
    private double getRadius(){
        return this.radius;
    }

    private void setHeight(double height){
        this.height = height;
    }

    private double getHeight(){
        return this.height;
    }

    public double volume(){
        double volume = Math.PI * (radius*radius) * height;
        return volume;
    }

    public double surfaceArea(){
        double surfaceArea = (Math.PI * 2 * (radius*radius)) + (2 * Math.PI * radius * height);
        return surfaceArea;
    }
}