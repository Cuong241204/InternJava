public abstract class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department){
        setId(id);
        setName(name);
        setDepart(department);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepart(){
        return department;
    }
    public void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("id must be >0");
        }
        this.id = id;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is not null");
        }
        this.name = name;
    }
    public void setDepart(String depart){
        if(depart == null || depart.trim().isEmpty()){
            throw new IllegalArgumentException("Error");
        }
        this.department = depart;
    }
    public abstract double calculateSalary();
    @Override
    public String toString(){
        return id + " - " + name + " - " + department;
    }

}
