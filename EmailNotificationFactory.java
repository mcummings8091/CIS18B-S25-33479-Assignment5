public class EmailNotificationFactory implements NotificationFactory<String> {
    @Override
    public Notification<String> createNotification(String content) {
        return new EmailNotification(content);
    }
}