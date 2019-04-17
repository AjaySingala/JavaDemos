public class MessageUtil {
    private String message;

    public MessageUtil(String msg) {
        this.message = msg;
    }
    public String printMessage() {
        return message;
    }

    public String salutationMessage() {
        return "Hi! " + message;
    }
}