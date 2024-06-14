package id.my.hendisantika.orderservice.controller;

import id.my.hendisantika.orderservice.entity.PurchaseOrder;
import id.my.hendisantika.orderservice.service.PurchaseOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@Tag(name = "Order", description = "Order API with documentation annotations")
public class OrderController {

    private final PurchaseOrderService purchaseOrderService;

    @GetMapping("/all")
    @Operation(
            summary = "Get All Orders",
            description = "Get All Orders .",
            tags = {"Order"})
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    description = "Success",
                    responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation =
                            Long.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Not found", responseCode = "404",
                    content = @Content),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Internal error", responseCode = "500"
                    , content = @Content)
    }
    )
    public List<PurchaseOrder> getAllOrders() {
        return this.purchaseOrderService.getPurchaseOrders();
    }

    @PostMapping("/create")
    @Operation(
            summary = "Create New Order",
            description = "Create New Order .",
            tags = {"Order"})
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    description = "Success",
                    responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation =
                            Long.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Not found", responseCode = "404",
                    content = @Content),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Internal error", responseCode = "500"
                    , content = @Content)
    }
    )
    public void createOrder(@RequestBody PurchaseOrder purchaseOrder) {
        this.purchaseOrderService.createPurchaseOrder(purchaseOrder);
    }
}
