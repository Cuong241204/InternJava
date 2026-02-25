public class Circle extends Shape{
    private double radius;
    public Circle(double r){
        setRadius(r);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        if(r<0){
            throw new IllegalArgumentException("Bán kính r >=0");
        }
        this.radius = r;

    }
    @Override
    public double area(){
        return Math.PI*radius * radius;
    }
    @Override
    public String toString(){
        return "Hình tròn bán kính r = " + radius + " - Area: " + area();
    }
}
