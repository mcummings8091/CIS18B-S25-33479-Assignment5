public interface NotificationFactory<T> {
    Notification<T> createNotification(T content);
}