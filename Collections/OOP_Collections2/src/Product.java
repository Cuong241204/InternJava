public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public Product(int id, String name, double price, int quantity){
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setId(int id){
        if(id <=0){
            throw new IllegalArgumentException("Id must be >0");
        }
        this.id = id;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Không được bỏ trống.");
        }
        this.name = name;
    }
    public void setPrice(double price){
        if(price <0){
            throw new IllegalArgumentException("Price must be >= 0");
        }
        this.price = price;
    }
    public void setQuantity(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException(">=0");
        }
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return id + " - " + name + " " + price + " " + quantity;
    }
}
