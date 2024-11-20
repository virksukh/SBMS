package in.india.service;
import in.india.entity.User;
import in.india.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser.getId() != null;
    }
}
