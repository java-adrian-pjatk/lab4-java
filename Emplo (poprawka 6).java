// autorzy Adrian Witkowski
// data wykonania 27.04.2019
// cel: Employee 06
import java.util.Date;

public class Emplo
{
    private int id;
    private int salary;
    private String Name;
    private Date dateOfJoining;

    public Emplo (int id, String Name, int salary)
    {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
        this.dateOfJoining = new Date();
    }

    public String toString()
    {
        return "Employee id="+id+",Name "+Name+", salary = " +salary+", date of joining = "+dateOfJoining;
    }

}