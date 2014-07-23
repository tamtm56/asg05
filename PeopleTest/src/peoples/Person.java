package peoples;
import java.util.Date;
public class Person 
{
	public String name;
	protected Date birthday;
	public Person()
	{
		name = "";
		birthday = null;
	}
	public Person(String _name, Date _birthday)
	{
		name = _name;
		birthday = _birthday;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return name + "-" + birthday;
	}

}
