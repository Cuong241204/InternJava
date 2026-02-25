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
    public void setId(int id){
        if(id <=0 ){
            throw new IllegalArgumentException("id must be > 0");
        }
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String ht){
        if(ht == null || ht.trim().isEmpty()){
            throw new IllegalArgumentException("Name not isempty");
        }
        this.name = ht;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        if(gpa <0 || gpa > 4){
            throw new IllegalArgumentException("gpa in 0->4");
        }
        this.gpa = gpa;

    }
    @Override
    public String toString(){
        return id + " - " + name + " - " + gpa;
    }
}
