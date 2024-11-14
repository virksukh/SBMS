package in.india.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
public class MySQLUserDaoImpl implements UserDao {
    public MySQLUserDaoImpl() {
        System.out.println("MySQL UserDao Impl constructor");
    }

    public String findNameById(int id) {
        if(id==1){
            return "raj";
        }else if(id==2){
            return "kumar";
        }else {
            return "invalid id";
        }
    }
}
