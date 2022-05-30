package messages;

public interface IGradeAnnounement
{
    public String prepareMessage(String[] placeHolders);
    public boolean verifyGrades();
}