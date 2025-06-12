
import java.util.ArrayList;


public class NotificationBuilder<T> {
    private T content;
    private String sender;
    private ArrayList<String> ccList;


    public NotificationBuilder<T> setContent(T content) {
        this.content = content;
        return this;
    } // "return this" for method chaining

    public NotificationBuilder<T> setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public NotificationBuilder<T> addCC(ArrayList<String> ccRecipients) {
        ccList = new ArrayList<>(ccRecipients);
        return this;
    }

    public DetailedNotification<T> build() {
        if (sender == null) {
            sender = "System"; // Default for sender value
        } else if (ccList == null) {
            ccList = new ArrayList<>(); // Avoids null pointers
        }
        return new DetailedNotification<>(content, sender, ccList);
    }
}