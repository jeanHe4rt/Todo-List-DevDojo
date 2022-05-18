package todolist.devdojo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todolist.devdojo.Models.User;
import todolist.devdojo.service.UserService;
import todolist.devdojo.utils.DateUtil;

import java.util.List;

@RestController
@RequestMapping("Users")
@Log4j2
@RequiredArgsConstructor
public class UserController {
    private final DateUtil dateUtil;
    private final UserService userService;
    @GetMapping
    public List<User> list(){
        return userService.listAll();

    }

}
