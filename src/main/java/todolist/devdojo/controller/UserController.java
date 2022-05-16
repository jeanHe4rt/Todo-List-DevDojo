package todolist.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todolist.devdojo.domain.User;

import java.util.List;

@RestController
@RequestMapping("Users")
public class UserController {

    @GetMapping(path = "List")
    public List<User> list(){
        return List.of(new User("Jean"), new User("Élen"));
    }

}
