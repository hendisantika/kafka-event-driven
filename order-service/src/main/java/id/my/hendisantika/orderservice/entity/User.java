package id.my.hendisantika.orderservice.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:45
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
