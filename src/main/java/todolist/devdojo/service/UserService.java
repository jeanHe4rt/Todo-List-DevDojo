package todolist.devdojo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import todolist.devdojo.Models.User;

import java.util.List;
@Service
public class UserService {
    private List<User> Users = List.of(new User(1L,"Jean"), new User(2L,"Élen"));
    //private final UserRepository userRespository;
    public List<User> listAll() {
        return Users;
    }
    public User getById(long id) {
        return Users.stream()
                .filter( user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not Found"));
    }
}
