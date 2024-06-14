package id.my.hendisantika.orderservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:44
 * To change this template use File | Settings | File Templates.
 */
@Document
@Getter
@Setter
public class PurchaseOrder {
    @Id
    private String id;
    private User user;
    private Product product;
    private double price;
}
