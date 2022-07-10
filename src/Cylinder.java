public class Cylinder extends Circle{
    //Declare all the field
    private double height;

    //Create the constructor
    public Cylinder(double radius, double height){
        super(radius);
        if (height <= 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Create the getter
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return (getArea() * this.height);
    }
}
