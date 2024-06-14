package id.my.hendisantika.userservice.repository;

import id.my.hendisantika.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:24
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
}
