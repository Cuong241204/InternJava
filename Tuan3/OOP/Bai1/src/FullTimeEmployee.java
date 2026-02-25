public class FullTimeEmployee extends Employee{
    private double bonus;
    public FullTimeEmployee(int id, String name, double salary, double bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return getSalary() + bonus;
    }

}
