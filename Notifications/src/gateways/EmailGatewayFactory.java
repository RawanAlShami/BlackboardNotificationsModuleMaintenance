package gateways;

public class EmailGatewayFactory implements GatewaysFactory
{
	public void sendDailyNewsMessage(Object message, String email)
	{
		//SET PLACEHOLDER
		String[] placeHolders = new String[] {};
		DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
		dailyNewsEmailMessage.prepareMessage(placeHolders);
		//CODE TO SEND MESSAGE TO OBSERVER
	}

	public void sendGradeAnnouncementMessage(Object message, String email)
	{
		//SET PLACEHOLDER
		String[] placeHolders = new String[] {};
		GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
		announcementEmailMessage.prepareMessage(placeHolders);
		//CODE TO SEND MESSAGE TO OBSERVER
	}

	public void sendTaskAddedMessage(Object message, String email)
	{
		//SET PLACEHOLDER
		String[] placeHolders = new String[] {};
		TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
		addedEmailMessage.prepareMessage(placeHolders);
		//CODE TO SEND MESSAGE TO OBSERVER
	}
}