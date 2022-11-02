import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {

    private static final File usersFile = new File("Data/Users.txt");
    private static UserManager manager = null;

    public static UserManager getInstance() {
        if (manager == null)
            manager = new UserManager();
        return manager;
    }

    private List<User> userList = Collections.emptyList();

    public void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(usersFile, StandardCharsets.UTF_8))) {
            userList = reader.lines().map(line -> {
                String[] split = line.split(";");
                if (split.length != 2) {
                    System.out.println("invalid user: " + line);
                    return null;
                }

                return new User(split[0].trim(), split[1].trim());
            }).collect(Collectors.toList());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean hasUser(String username, String password) {
        for (User user : userList) {
            if (user != null && user.getUserName().equals(username) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
