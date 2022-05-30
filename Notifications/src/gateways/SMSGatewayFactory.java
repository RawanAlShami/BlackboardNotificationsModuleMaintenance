package gateways;

public class SMSGatewayFactory implements GatewaysFactory
{
	public void sendDailyNewsMessage(Object message, String email)
	{
		//SET PLACEHOLDER
		String[] placeHolders = new String[] {};
		DailyNewsMobileMessage dailyNewsMobileMessage = (DailyNewsMobileMessage) message;
		dailyNewsMobileMessage.prepareMessage(placeHolders);
		//CODE TO SEND MESSAGE TO OBSERVER
	}

	public void sendGradeAnnouncementMessage(Object message, String email)
	{
		//SET PLACEHOLDER
		String[] placeHolders = new String[] {};
		GradesAnnouncementMobileMessage announcementMobileMessage = (GradesAnnouncementMobileMessage) message;
		announcementMobileMessage.prepareMessage(placeHolders);
		//CODE TO SEND MESSAGE TO OBSERVER
	}

	public void sendTaskAddedMessage(Object message, String email)
	{
		//SET PLACEHOLDER
		String[] placeHolders = new String[] {};
		TaskAddedMobileMessage taskAddedMobileMessage = (TaskAddedMobileMessage) message;
		taskAddedMobileMessage.prepareMessage(placeHolders);
		//CODE TO SEND MESSAGE TO OBSERVER
	}
}