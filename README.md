# kafka-event-driven
Kafka Event Driven using Spring Boot

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/kafka-event-driven.git`
2. Navigate to the folder: `cd kafka-event-driven`
3. Navigate to user service: `cd user-service`
4. Make sure your Kafka Cluster UP & RUNNING
5. Run user-service: `mvn clean spring-boot:run`
6. Navigate to order service: `cd order-service`
7. Run order-service: `mvn clean spring-boot:run`
8. Open your favorite browser: http://localhost:8080/swagger-ui
9. Open your favorite browser: http://localhost:8081/swagger-ui

Purchase Order:

```shell
{
        "id": "5dcfb1056637311008e17f80",
        "user": {
            "id": 1,
            "firstname": "Itadori",
            "lastname": "Yuji",
            "email": "yuji@yopmail.com"
        },
        "product": {
            "id": 1,
            "description": "iPad"
        },
        "price": 300
    }
```

Update User:

```shell
{
    "id": 1,
    "firstname":"Satoru",
    "lastname": "Gojo",
    "email": "gojo@yopmail.com"
}
```
