package courses;
import java.util.ArrayList;

import gateways.EmailGateway;
import gessages.TaskAddedEmailMessage;
import users.Professor;
import users.Student;
import users.TA;

public class Course
{
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;

	ArrayList<Observers> observersForEmailNotification;
	ArrayList<Observers> observersForSMSNotification;
	
	public Course(String name, String code)
	{
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();


		observersForEmailNotification = new ArrayList<Observers>();
		observersForSMSNotification = new ArrayList<Observers>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void subscribeObserverToEmailNotification(Observers observer)
	{
		observersForEmailNotification.add(observer);
	}

	public void subscribeObserverToSMSNotification(Observers observer)
	{
		observersForSMSNotification.add(observer);
	}
	
	
	public void addAssignment(String assignName, String assignBody)
	{
		announcements.add(assignName);
		String[] placeholders = new String[] {assignName, assignBody};
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders)
	{
		GatewaysFactory emailGatewaysFactory=new EmailGatewayFactory();

		for(Observers observer : observersForEmailNotification)
		{
			emailGatewaysFactory.sendTaskAddedMessage(placeholders,observer.getEmail());
			observer.updateObserver(notification);
		}
	}
}
