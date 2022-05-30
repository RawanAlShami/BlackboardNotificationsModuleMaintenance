package gateways;

import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAddedMobileMessage;

public interface GatewaysFactory
{
    public void sendDailyNewsMessage(Object message, String email);
    public void sendGradeAnnouncementMessage(Object message, String email);
    public void sendTaskAddedMessage(Object message, String email);
}