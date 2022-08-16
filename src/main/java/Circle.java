public class Circle {

    private double radius;

    public Circle(double newRadius){
        this.radius = newRadius;
    }


    @Override
    public String toString() {
        return "Circle{" + "radius='" + radius + '}';
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }

}
