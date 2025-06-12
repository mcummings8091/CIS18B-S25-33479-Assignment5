public class EmailObserver implements Observer<String> {
    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(Notification<String> notification){
        System.out.println("Email sent to : " + email + ": " +  notification.getContent());
    }

}