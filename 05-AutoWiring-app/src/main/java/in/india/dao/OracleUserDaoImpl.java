package in.india.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("oracle")
public class OracleUserDaoImpl implements UserDao {
    public OracleUserDaoImpl() {
        System.out.println("Oracle UserDao Impl constructor");
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
