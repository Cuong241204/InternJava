public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        setId(id);
        setName(name);
        setSalary(salary);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("id >0");
        }
        this.id = id;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is not null");
        }
        this.name = name;
    }
    public void setSalary(double salary){
        if(salary <0){
            throw new IllegalArgumentException("salary >=0");
        }
        this.salary = salary;
    }
    public double calculateSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return id + " - " + name + " - " + salary + " - " + calculateSalary();
    }


}
