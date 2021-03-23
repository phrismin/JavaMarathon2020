package day13;

public class Task1 {
    public static void main(String[] args) {
        User alex1 = new User("Alex");
        User julia2 = new User("Julia");
        User nastya3 = new User("Nastya");

        alex1.sendMessage(julia2, "Hi, Julia!");
        alex1.sendMessage(julia2, "Where are you?");

        julia2.sendMessage(alex1, "Hi, Alex!");
        julia2.sendMessage(alex1, "I'm at home.");

        julia2.sendMessage(alex1, "Come to here.");

        nastya3.sendMessage(alex1, "Hey, boy!");
        nastya3.sendMessage(alex1, "Is your name Alex?");
        nastya3.sendMessage(alex1, "Hi-hi");


        alex1.sendMessage(nastya3, "Hey!");
        alex1.sendMessage(nastya3, "Yeap, stupid.");
        alex1.sendMessage(nastya3, "Bye.");

        nastya3.sendMessage(alex1, "OMG");

        MessageDatabase.showDialog(alex1, nastya3);
    }
}
