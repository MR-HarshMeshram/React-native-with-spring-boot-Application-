package HTech.AppWithSpringboot.Controllers;

import HTech.AppWithSpringboot.Models.User;
import HTech.AppWithSpringboot.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AppWith/SpringBoot")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.saveuser(user);
    }
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
