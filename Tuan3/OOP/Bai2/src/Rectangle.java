public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        setWidth(width);
        setHeight(height);
    }
    public void setWidth(double w){
        if(w<=0){
            throw new IllegalArgumentException("w >0");
        }
        this.width = w;
    }
    public void setHeight(double h){
        if(h<=0){
            throw new IllegalArgumentException("h >0");
        }
        this.height = h;
    }
    @Override
    public double area(){
        return width * height;
    }
    @Override
    public String getName(){
        return "Hcn";
    }
    @Override
    public String toString(){
        return getName() + " - " + area();
    }
}
