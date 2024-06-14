package id.my.hendisantika.orderservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.my.hendisantika.orderservice.entity.PurchaseOrder;
import id.my.hendisantika.orderservice.entity.User;
import id.my.hendisantika.orderservice.repository.PurchaseOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:47
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class UserServiceEventHandler {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final PurchaseOrderRepository purchaseOrderRepository;

    @KafkaListener(topics = "user-service-event")
    public void consume(String userStr) {
        try {
            User user = OBJECT_MAPPER.readValue(userStr, User.class);
            this.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    public void updateUser(User user) {
        List<PurchaseOrder> userOrders = this.purchaseOrderRepository.findByUserId(user.getId());
        userOrders.forEach(p -> p.setUser(user));
        this.purchaseOrderRepository.saveAll(userOrders);
    }
}
