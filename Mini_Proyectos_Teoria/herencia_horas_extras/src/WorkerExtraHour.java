public class WorkerExtraHour extends Worker{

    private Integer extraHoursWorked;
    private Double pricePerHour;

    public WorkerExtraHour(String name, Double salary, Integer hours, Double pricePerHour){
        super(name,salary);
        this.extraHoursWorked = hours;
        this.pricePerHour=pricePerHour;
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary() + (extraHoursWorked * pricePerHour);
    }
}
