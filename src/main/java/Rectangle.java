public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double newLength, double newWidth){
        this.length = newLength;
        this.width = newWidth;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length='" + length + ", width='" + width + '}';
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter(){
        return (this.length*2) +(this.width*2);
    }

}
