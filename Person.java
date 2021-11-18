public class Person
{

private String	firstname;
private String	othername;
private String	surname;

	public Person()
	{
		firstname = "";
		othername = "";
		surname = "";
	}

	public Person(String value1, String value2)
	{
		firstname = value1;
		surname = value2;
		othername = "";
	}

	public String getFirstName()
	{
		return firstname;
	}

	public void setFirstName(String newfirstName)
	{
		this.firstname = newfirstName;
	}


	public String getSurname()
		{
			return surname;
		}

		public void setSurame(String newsurame)
		{
			this.surname = newsurame;
	}

	public int getAge()
	{

	}



}