public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        setRadius(radius);
    }
    public void setRadius(double r){
        if(r <=0){
            throw new IllegalArgumentException("r >0");
        }
        this.radius = r;
    }
    @Override
    public double area(){
        return Math.PI*radius * radius;
    }
    @Override
    public String getName(){
        return "Hình tròn";
    }
    @Override
    public String toString(){
        return getName() + " - "+ area();
    }
}
