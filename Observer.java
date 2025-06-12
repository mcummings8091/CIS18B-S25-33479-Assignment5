public interface Observer<T> {
    void update(Notification<T> notification);
}