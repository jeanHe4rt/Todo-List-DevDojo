package todolist.devdojo.service;

import org.springframework.stereotype.Service;
import todolist.devdojo.Models.User;

import java.util.List;
@Service
public class UserService {
    //private final UserRepository userRespository;
    public List<User> listAll() {
        return List.of(new User(1L,"Jean"), new User(2L,"Élen"));
    }
}
