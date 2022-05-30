package users;

public class Student extends Observers
{
	int id;
	
	public Student(String name, int id, String email, String phoneNumber)
	{
		super(name,email,phoneNumber);
		Id = id;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public void updateObserver(String message)
	{
		//DO SOMETHING
	}
}
