public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department){
        setId(id);
        setName(name);
        setSalary(salary);
        setDepart(department);
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
    public String getDepart(){
        return department;
    }
    public void setId(int id){
        if(id <=0){
            throw new IllegalArgumentException("id >=0");
        }
        this.id = id;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Ko đc bỏ trống");
        }
        this.name = name;
    }
    public void setSalary(double salary){
        if(salary <0){
            throw new IllegalArgumentException("Salary must be >=0");
        }
        this.salary = salary;
    }
    public void setDepart(String depart){
        if(depart == null || depart.trim().isEmpty()){
            throw new IllegalArgumentException("Ko đúng định dạng.");
        }
        this.department = depart;
    }
    @Override
    public String toString(){
        return id + " - " + name + " - " + salary + " - " + department;
    }

}
