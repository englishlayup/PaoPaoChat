import java.util.Date;

public class Message {
    private final String MessageID;
    private final Date date;
    private final String SenderID;
    private final String Message;
    private boolean deleted;

    public Message(String messageID, String senderID, String message) {
        deleted = false;
        MessageID = messageID;
        date = new Date();
        SenderID = senderID;
        Message = message;
    }
    
    public boolean setDeleted() {
        deleted = true;   
    }

}
