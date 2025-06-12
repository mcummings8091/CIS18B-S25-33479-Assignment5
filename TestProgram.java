import java.util.ArrayList;

public class TestProgram {
    public static void formatSpacing() {
        System.out.println("\n\n\n");
    }
    public static void main(String[] args) {
        ArrayList<String> ccList = new ArrayList<String>() {{
            add("recipient 1");
            add("recipient 2");
            add("recipient 3");
        }};


        // Create notification managers
        NotificationManager<String> notificationManager = new NotificationManager<>();
        NotificationManager<ArrayList<String>> detailedNotificationManager = new NotificationManager<>();

        SMSObserver smsObserver = new SMSObserver("111-222-3333");
        EmailObserver emailObserver = new EmailObserver("ExampleEmail@example.com");

        DetailedNotificationObserver detailedObserver = new DetailedNotificationObserver(ccList);  

        // Register observers to notification managers
        notificationManager.addObserver(smsObserver);
        notificationManager.addObserver(emailObserver);

        detailedNotificationManager.addObserver(detailedObserver);

        // Create test notification
        Notification<String> notification = new SMSNotification("Test message!");

        // Test notification process
        notificationManager.notifyObservers(notification);
        
        formatSpacing();

        // Test factories
        // SMS Factory
        SMSNotificationFactory smsFactory = new SMSNotificationFactory();
        notificationManager.notifyObservers(smsFactory.createNotification("Test message from the SMSfactory!"));

        formatSpacing();

        // Email factory
        EmailNotificationFactory emailFactory = new EmailNotificationFactory();
        notificationManager.notifyObservers(emailFactory.createNotification("Test message from the EmailFactory!"));

        formatSpacing();

        // Test builder
        NotificationBuilder notificationBuilder = new NotificationBuilder();
        notificationBuilder.setContent("This is the content set from the builder!").setSender("The mystical magical developer").addCC(ccList);

        detailedNotificationManager.notifyObservers(notificationBuilder.build());

        

    }
}