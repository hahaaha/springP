package com;

public class HelloWorld {
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void outMessage() {
        System.out.println("your com.Message:" + message.getM());
    }
}
