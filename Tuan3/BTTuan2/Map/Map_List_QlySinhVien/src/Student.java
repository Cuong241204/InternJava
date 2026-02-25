public class Student {
    private int id;
    private String name;
    private double gpa;
    public Student(int id, String name, double gpa){
        setId(id);
        setName(name);
        setGpa(gpa);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    public void setId(int id){
        if(id <=0 ){
            throw new IllegalArgumentException("Id > 0");
        }
        this.id = id;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is not null");
        }
        this.name = name;
    }
    public void setGpa(double gpa){
        if(gpa <0 || gpa >4){
            throw new IllegalArgumentException("0<=Gpa<=4");
        }
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return id + " - " + name + " - " + gpa;
    }
}
