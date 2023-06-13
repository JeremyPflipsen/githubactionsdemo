package com.example.githubactionsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class GithubactionsdemoApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetThisMan(){
		String url = "http://localhost:" + port + "/getThisMan";
		DemoModel response = this.restTemplate.getForObject(url, DemoModel.class);

		assertNotNull(response);
	}

//	@Test
//	public void failureTest(){
//		fail();
//	}

}
