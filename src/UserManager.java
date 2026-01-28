import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    private User getUser(String email) {
        for (User user : this.users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        User existingUser = getUser(user.getEmail());
        if (existingUser == null) {
            this.users.add(user);
        }
    }

    public void removeUser(String email) {
        User user = getUser(email);
        if (user != null) {
            this.users.remove(user);
        }
    }

    public void updateUser(String email, String newName, String newEmail, Role newRole) {
        User user = getUser(email);
        if (user != null) {
            user.setName(newName);
            user.setEmail(newEmail);
            user.setRole(newRole);
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
