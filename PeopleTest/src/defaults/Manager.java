package defaults;
import java.util.Date;

import peoples.Employee;
public class Manager extends Employee
{
	private Employee assistant;
	public Manager()
	{
		super();
		assistant = null;
	}
	public Manager(String _name, Date _birthday, double _salary) //Constructor
	{
		
		super(_name, _birthday, _salary);
	}
	public void setAssistant(Employee _assistant)
	{
		assistant = _assistant;
	}
	public String toString()
	{
		return super.toString() + "-Asis." + assistant.name;
	}
}
