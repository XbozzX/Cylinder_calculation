public class Circle {
    //Declare all the field
    private double radius;

    //Create the constructor
    public Circle(double radius){
        if (radius <= 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    //Create the getter
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return ((radius * radius) * Math.PI);
    }
}
