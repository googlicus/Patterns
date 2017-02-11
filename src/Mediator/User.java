package Mediator;

/**
 * Created by Данил on 11.02.2017.
 */
public class User {
    private String name;

    public User(String userName){
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
