package id.my.hendisantika.userservice.controller;

import id.my.hendisantika.userservice.dto.UserDto;
import id.my.hendisantika.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/user-service")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public Long createUser(@RequestBody UserDto userDto) {
        return this.userService.createUser(userDto);
    }

}
