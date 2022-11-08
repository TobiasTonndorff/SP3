public class Main {
    public static void main(String[] args) {

        UserManager manager = UserManager.getInstance();

        manager.loadUsers();

        GUI loginpage = new GUI();
        loginpage.getClass();

    }
}