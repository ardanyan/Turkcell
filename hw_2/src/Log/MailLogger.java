package Log;

public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Log: " + message);
    }
    @Override
    public void error(String error) {
        System.out.println("Error: " + error);
    }
}
