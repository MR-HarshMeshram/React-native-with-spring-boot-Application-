package HTech.AppWithSpringboot.Services;

import HTech.AppWithSpringboot.Models.User;
import HTech.AppWithSpringboot.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public  User saveuser(User user){
        return  userRepo.save(user);
    }
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
