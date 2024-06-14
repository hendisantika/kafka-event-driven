package id.my.hendisantika.orderservice.repository;

import id.my.hendisantika.orderservice.entity.PurchaseOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

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
@Repository
public interface PurchaseOrderRepository extends MongoRepository<PurchaseOrder, String> {

    @Query("{ 'user.id': ?0 }")
    List<PurchaseOrder> findByUserId(long userId);
}
