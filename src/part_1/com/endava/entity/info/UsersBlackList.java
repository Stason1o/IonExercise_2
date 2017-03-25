package part_1.com.endava.entity.info;

import part_1.com.endava.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class UsersBlackList {
    static private List<User> bannedUsers;

    static{
        bannedUsers = new ArrayList<>();
        bannedUsers.add(new User("Vasile", "Cudalb", (byte)24));
        bannedUsers.add(new User("Petru", "Movila", (byte)30));
        bannedUsers.add(new User("Ion", "Ionel", (byte)40));
        bannedUsers.add(new User("Valera", "Petrovici", (byte)26));
    }

    public UsersBlackList() {
    }

    public static List<User> getBannedUsers() {
        return bannedUsers;
    }

    public static void setBannedUsers(List<User> list) {
        bannedUsers.addAll(list);
    }
}
