package jwt.example.services;

import jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Paras Jain", "paras@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Naman", "naman@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Darpan", "darpan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Uddesh", "uddesh@gmail.com"));
    }

    public List<User> getAllUsers(){
        return store;
    }
}
