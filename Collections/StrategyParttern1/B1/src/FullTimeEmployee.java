public class FullTimeEmployee extends Employee implements TaxAble{
    private double baseSalary;
    private double bonus;
    public FullTimeEmployee(int id, String name, String depart, double baseSalary, double bonus){
        super(id, name, depart);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }
    @Override
    public double calculateTax(){
        return calculateSalary() * 0.1;
    }
    @Override
    public String toString(){
        return super.toString() + " - " + calculateSalary() + " - " + calculateTax();
    }


}
