/* (C)2023 */
package com.example.githubactionsdemo;

import com.example.githubactionsdemo.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
@AutoConfigureMockMvc
public class ContainerTests {

    @Autowired
    BookRepository bookRepository;

    @Container @ServiceConnection
    private static PostgreSQLContainer postgreSQLContainer =
            new PostgreSQLContainer("postgres:15.2-alpine");

    @Container @ServiceConnection
    private static KafkaContainer kafkaContainer =
            new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.2.1"));

    @Test
    public void contextLoads() {
        System.out.println("Loads");
        assertTrue(postgreSQLContainer.isRunning());
        assertTrue(kafkaContainer.isRunning());
    }

    @Test
    public void dbInitializes(){
        System.out.println("initialize db");
        assertNotNull(bookRepository.getBookById(1));
        System.out.println(bookRepository.getBookById(1));
    }
}
