package day13;

import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user) && user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username.toString();
    }
}
