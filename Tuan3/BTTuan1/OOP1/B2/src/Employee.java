public class Employee {
    private int id;
    private String name;
    private double baseSalary;
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.baseSalary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }

}
