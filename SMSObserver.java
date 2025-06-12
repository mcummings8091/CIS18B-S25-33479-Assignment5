public class SMSObserver implements Observer<String> {
    private String phoneNumber;

    public SMSObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Notification<String> notification) {
        System.out.println("SMS Message sent to: " + phoneNumber + ": " +  notification.getContent());
    }
}