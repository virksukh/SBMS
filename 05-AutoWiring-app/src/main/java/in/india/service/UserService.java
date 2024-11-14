package in.india.service;

import in.india.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserDao userDao;
    
    public UserService(UserDao mysql) {
        this.userDao = mysql;
    }


    public void getName(int id){
        System.out.println(userDao.findNameById(id));
        System.out.println(userDao.getClass().getName());
    }
}
