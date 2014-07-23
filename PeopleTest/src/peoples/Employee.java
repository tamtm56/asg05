package peoples;
import java.util.Date;
public class Employee extends Person
{
	protected double salary;
	
	public Employee()
	{
		super();
		salary = 0;
	}
	public Employee(String _name, Date _birthday, double _salary) //Constructor
	{
		
		super(_name, _birthday);
		salary = _salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return super.toString() + "-" + salary;
	}
}
