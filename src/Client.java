import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Client {
    private final String UserID;
    private String Username;
    private int status;
    LinkedList<Conversation> Conversations = new LinkedList<>(); //


    public Client(String ID, String Username) {
        this.UserID = ID;
        this.Username = Username;
    }

    public void loadData() {

        try {
            Scanner sc = new Scanner(new File("UsersData\\" + Username + "\\Conversations.txt"));

            while(sc.hasNext()) {
                String ConversationID = sc.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
