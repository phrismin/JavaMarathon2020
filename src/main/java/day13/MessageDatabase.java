package day13;

import java.util.*;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        List<Message> newList = new LinkedList<>();
        for (Message message : messages) {
            if (message.getSender().toString().equals(u1.getUsername()) && message.getReceiver().toString().equals(u2.getUsername())) {
                newList.add(message);
            } else if (message.getReceiver().toString().equals(u1.getUsername()) && message.getSender().toString().equals(u2.getUsername())) {
                newList.add(message);
            }
        }
        for (Message message : newList) {
            System.out.printf("%s: %s\n", message.getSender(), message.getText());
        }
    }
}
