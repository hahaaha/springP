public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void outMessage() {
        System.out.println("your Message:" + message);
    }
}
