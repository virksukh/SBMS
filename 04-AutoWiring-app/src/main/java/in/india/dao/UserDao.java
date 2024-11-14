package in.india.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public UserDao() {
        System.out.println("userDao constructor");
    }
    public String findUserNameById(int id) {
        if(id == 1){
            return "Raju";
        }else if (id == 2){
            return "Rani";
        }else{
            return "invalid id";
        }
    }
}
