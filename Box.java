public class Box{

    double length;
    double width;
    double height;


    public Box(double width, double height, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }

    public Box(Box oldBox){
        this.height = oldBox.height;
        this.length = oldBox.length;
        this.width = oldBox.width;
    }
    

    public double volume(){
        double volume = height*width*length;
        return volume;
    }

    public double area(){
        double area = 2*faceArea() + 2*topArea() + 2*sideArea();
        return area;
    }

    private double faceArea(){
        double faceArea = height*width;
        return faceArea;
    }

    private double topArea(){
        double topArea = length * width;
        return topArea;
    }

    private double sideArea(){
        double sideArea = length*height;
        return sideArea;
    }

    public double length(){
        return length;
    }
    public double width(){
        return width;
    }
    public double height(){
        return height;
    }
    public Box biggerBox( Box oldBox){
        return new Box( 1.25*oldBox.width, 1.25*oldBox.height, 1.25*oldBox.length);
    }
    public Box smallerBox(Box oldBox){
        return new Box( .75*oldBox.width, .75*oldBox.height, .75*oldBox.length);
    }

    public boolean nests( Box outsideBox){
        if (height<outsideBox.height && length < outsideBox.length && width < outsideBox.width){
            return true;
        }else{
            return false;
        }
    }
}