package Mediator;

import java.util.Date;

/**
 * Created by Данил on 11.02.2017.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(String.format("%s[%s]:%s", new Date().toString(), user.getName(), message));
    }
}
