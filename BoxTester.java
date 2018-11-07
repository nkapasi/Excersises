public class BoxTester{
    public static void main(String[]args){
        Box box = new Box(2.5,5.0,6.0);

        System.out.println("Area: " + box.area() + "volume: " + box.volume());

        System.out.println("length: " + box.length+"height: " + box.height+ " width " + box.width);

        Box bob = box.smallerBox(box);
        
        System.out.println("Area: " + bob.area() + "volume: " + bob.volume());

        System.out.println("length: " + bob.length+"height: " + bob.height+ " width " + bob.width);

        System.out.println(bob.nests(box));
    }
}