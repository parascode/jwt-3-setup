package jwt.example.controllers;

import jwt.example.entities.User;
import jwt.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/current")
    public String currentUser(Principal principal){
        return principal.getName();
    }
}
