public class Teacher extends Person implements Payable{
    private double salary;
    public Teacher(int id, String name, double salary){
        super(id, name);
        this.salary = salary;
    }
    @Override
    public double pay(){
        return salary;
    }
    @Override
    public String toString(){
        return super.toString() + " - " + pay();
    }

}
