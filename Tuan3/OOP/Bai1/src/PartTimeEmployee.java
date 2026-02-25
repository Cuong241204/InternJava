public class PartTimeEmployee extends Employee {
    private int hour;
    private double rate;
    public PartTimeEmployee(int id, String name, int hour, double rate){
        super(id, name, 0);
        this.hour = hour;
        this.rate = rate;
    }
    @Override
    public double calculateSalary(){
        return rate * hour;
    }
    @Override
    public String toString(){
        return getId() + " - " + getName() + " - " + calculateSalary();
    }

}
