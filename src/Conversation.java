import java.util.ArrayList;

public class Conversation {
    private final String ID;
    private final String SenderID;
    private final String RecipientID;
    ArrayList<Message> Messages = new ArrayList<>(155);

    public Conversation(String ID, String SenderID, String RecipientID) {
        this.ID = ID;
        this.SenderID = SenderID;
        this.RecipientID = RecipientID;
    }


}
