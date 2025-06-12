import java.util.ArrayList; 

public class DetailedNotificationObserver implements Observer<ArrayList<String>> {
    private ArrayList<String> recipients;

    public DetailedNotificationObserver(ArrayList<String> recipients) {
        this.recipients = new ArrayList<>(recipients);
    }

    @Override
    public void update(Notification<ArrayList<String>> notification) {
        System.out.println("Detailed notification sent to :");
        for (String recipient : recipients) {
            System.out.println(recipient);
        }

        System.out.println("Message content: ");
        System.out.println(notification.getContent());
    }
}