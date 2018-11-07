public class CylinderTester{
    public static void main(String[]args){
        double radius = 12;
        double height = 15;
        
        
        
        Cylinder chuck = new Cylinder(radius, height);

        System.out.println(chuck.volume() + "  " + chuck.surfaceArea());
    }
}