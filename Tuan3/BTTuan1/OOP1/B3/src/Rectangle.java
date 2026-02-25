public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double w , double h){
        this.width = w;
        this.height = h;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public double area(){
        return width*height;
    }
    @Override
    public String toString(){
        return "HCN - Cd: " + getWidth() + " - Cr: " + getHeight() + " - Area: " + area();

    }

}
