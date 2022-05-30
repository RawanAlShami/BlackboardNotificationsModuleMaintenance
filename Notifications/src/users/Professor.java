package users;

import java.sql.Date;

public class Professor extends Observers
{
	Date hirringDate;
	String phDTopic;
	String department;
	
	public Professor(String name, String department, Date hirringDate, String phDTopic, String email, String phoneNumber)
	{
		super(name,email,phoneNumber);
		this.department = department;
		this.hirringDate = hirringDate;
		PhDTopic = phDTopic;
	}

	public String getDepartment() { return department; }

	public void setDepartment(String department) { this.department = department; }

	public Date getHirringDate() { return hirringDate; }

	public void setHirringDate(Date hirringDate) { this.hirringDate = hirringDate; }

	public String getPhDTopic() { return PhDTopic; }

	public void setPhDTopic(String phDTopic) { PhDTopic = phDTopic; }

	public void updateObserver(String message)
	{
		//DO SOMETHING
	}
}
