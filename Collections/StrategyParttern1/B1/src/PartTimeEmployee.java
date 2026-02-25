public class PartTimeEmployee extends Employee{
    private double hourRate;
    private int hoursWorked;
    public PartTimeEmployee(int id, String name, String depart, double hourRate, int hoursWorked){
        super(id, name, depart);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hourRate * hoursWorked;
    }
    @Override
    public String toString(){
        return super.toString() + " - " + calculateSalary();
    }
}
