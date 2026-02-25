public class PartTimeEmployee extends Employee{
    private int hourWorked;
    private double rate;
    public PartTimeEmployee(int id, String name, int hour, double rate){
        super(id, name, 0);
        this.hourWorked = hour;
        this.rate = rate;
    }
    @Override
    public double calculateSalary(){
        return hourWorked * rate;
    }
    @Override
    public String toString(){
        return getId() + " - " + getName() + " - " + calculateSalary();
    }


}
