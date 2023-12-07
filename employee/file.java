package HTML;

public class file {

    private String name;
    private int salary;
    private int hours;

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int getHours(){
        return hours;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setHours(int newHours){
        hours = newHours;
    }
    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public int paycheck(){
        return hours * salary;
    }

    
}
