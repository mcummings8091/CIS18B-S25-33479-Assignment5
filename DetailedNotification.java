import java.util.ArrayList;

public class DetailedNotification<T> extends Notification<T> {
    private String sender;
    private ArrayList<String> cclist; 

    public DetailedNotification(T content, String sender, ArrayList<String> ccList) {
        super(content);
        this.sender = sender;
        this.cclist = new ArrayList<String>(ccList);
    }
}