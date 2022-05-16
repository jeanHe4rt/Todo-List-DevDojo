package todolist.devdojo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todolist.devdojo.Utils.DateUtils;
import todolist.devdojo.domain.User;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("Users")
@Log4j2
@RequiredArgsConstructor
public class UserController {

    private final DateUtils dateUtils;

    // Requestdo GetMapping
//    http://localhost:8080/Users/List
    @GetMapping(path = "List")
    public List<User> list(){
        log.info("Data da cagada "+ dateUtils.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new User("Jean"), new User("Élen"));
    }

}
