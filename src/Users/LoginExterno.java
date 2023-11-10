package Users;

import java.util.Date;

public class LoginExterno implements AdapterLogin {

    @Override
    public String login(String email, String password) {
        return "Login Externo:  " + new Date();
    }

}
