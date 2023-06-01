import model.SuperUsuario;
import model.User;

public class App {
    public static void main(String[] args) throws Exception {
        new SuperUsuario("gohanzin", 0.0);
        new SuperUsuario("kifelzin", 100.90);
        new SuperUsuario("renanzin", 0.0);

        System.out.println(User.getUsers().get(0).getName());
        System.out.println(User.getCount());
        for (User user : User.getUsers()) {
            System.out.println(user.toString());
        }
    }
}