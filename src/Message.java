import java.util.Date;

public class Message {
    private final String MessageID;
    private final Date date;
    private final String SenderID;
    private final String Message;

    public Message(String messageID, String senderID, String message) {
        MessageID = messageID;
        date = new Date();
        SenderID = senderID;
        Message = message;
    }

}
