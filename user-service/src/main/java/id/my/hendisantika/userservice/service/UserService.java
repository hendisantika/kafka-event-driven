package id.my.hendisantika.userservice.service;

import id.my.hendisantika.userservice.dto.UserDto;
import id.my.hendisantika.userservice.entity.User;
import id.my.hendisantika.userservice.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:25
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UsersRepository usersRepository;

    private final KafkaTemplate<Long, String> kafkaTemplate;

    public Long createUser(UserDto userDto) {
        User user = new User();
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setEmail(userDto.getEmail());
        return this.usersRepository.save(user).getId();
    }

    @Transactional
    public void updateUser(UserDto userDto) {
        this.usersRepository.findById(userDto.getId())
                .ifPresent(user -> {
                    user.setFirstname(userDto.getFirstname());
                    user.setLastname(userDto.getLastname());
                    user.setEmail(userDto.getEmail());
                    this.raiseEvent(userDto);
                });
    }
}
