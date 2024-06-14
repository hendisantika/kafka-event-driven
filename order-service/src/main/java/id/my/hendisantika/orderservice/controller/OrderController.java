package id.my.hendisantika.orderservice.controller;

import id.my.hendisantika.orderservice.service.PurchaseOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : kafka-event-driven
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/15/24
 * Time: 06:48
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/order-service")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class OrderController {

    private final PurchaseOrderService purchaseOrderService;
}
