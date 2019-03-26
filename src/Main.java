import com.luxsong.controller.UserController;
import com.luxsong.service.UserService;
import com.luxsong.ioc.context.IocContext;

public class Main {
    public static void main(String[] args) {
        UserController userController = (UserController) IocContext.applicationContext.get(UserController.class);
        userController.helloUsers();
    }
}
