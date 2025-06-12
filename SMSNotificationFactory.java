public class SMSNotificationFactory implements NotificationFactory<String> {

    @Override
    public Notification<String> createNotification(String content) {
        return new SMSNotification(content);
    }
}