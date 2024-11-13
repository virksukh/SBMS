package in.india.service;
import in.india.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserDao userDao;
    private EmailService emailService;
    private PwdService pwdService;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @Autowired
    public void setPwdService(PwdService pwdService) {
        this.pwdService = pwdService;
    }

   /* public UserService(UserDao userDao, EmailService emailService, PwdService pwdService) {
        this.userDao = userDao;
        this.emailService = emailService;
        this.pwdService = pwdService;
    }*/

    public void save(){
        emailService.sendEmail();
        pwdService.encryptPwd();
        userDao.connectToDatabase();
        System.out.println("record saved");
    }
}
