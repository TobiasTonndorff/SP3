public class Main {
    public static void main(String[] args) {

        UserManager manager = UserManager.getInstance();
        manager.loadUsers();
        System.out.println(manager.hasUser("Morten", "Fede"));
    }
}