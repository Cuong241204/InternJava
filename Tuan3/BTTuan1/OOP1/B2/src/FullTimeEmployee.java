public class FullTimeEmployee extends Employee{
    private double bonus;
    public FullTimeEmployee(int id, String name, double baseSalary, double bonus){
        super(id,name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return  super.calculateSalary() + bonus;
    }
    @Override
    public String toString(){
        return getId() + " - " + getName() + " - " + getBaseSalary() + " - " + calculateSalary();
    }




}
