package part_1.com.endava.util;

import part_1.com.endava.entity.User;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class BlackList {
    User[] bannedUsers;

    public BlackList() {
        this.bannedUsers = new User[]{
                new User("Vasile", "Cudalb", (byte)24),
                new User("Petru", "Movila", (byte)30),
                new User("Ion", "Ionel", (byte)40),
                new User("Valera", "Petrovici", (byte)26)
        };
    }

    public BlackList(User[] bannedUsers) {
        this.bannedUsers = bannedUsers;
    }

    public User[] getBannedUsers() {
        return bannedUsers;
    }

    public void setBannedUsers(User[] bannedUsers) {
        this.bannedUsers = bannedUsers;
    }
}
