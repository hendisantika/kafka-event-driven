package id.my.hendisantika.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.kafka.KafkaContainer;
import org.testcontainers.mongodb.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
@Testcontainers
class OrderServiceApplicationTests {

	/**
	 * MongoDB 7.0 is used on purpose: MongoDB 8.x refuses to start on Linux kernel >= 6.19
	 * (used by current GitHub-hosted runners), see https://jira.mongodb.org/browse/SERVER-121912.
	 */
	@Container
	@ServiceConnection
	static MongoDBContainer mongo = new MongoDBContainer(DockerImageName.parse("mongo:7.0"));

	@Container
	@ServiceConnection
	static KafkaContainer kafka = new KafkaContainer(DockerImageName.parse("apache/kafka:4.1.1"));

	@Test
	void contextLoads() {
	}

}
