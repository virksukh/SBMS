package in.india.service;

import in.india.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserDao userDao;
    public UserService() {
        System.out.println("UserService constructor");
    }
    public void getName(){
        System.out.println(userDao.findUserNameById(1));
    }
}
