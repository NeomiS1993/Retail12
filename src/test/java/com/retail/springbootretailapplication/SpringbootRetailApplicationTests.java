package com.retail.springbootretailapplication;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import com.retail.springbootretailapplication.Model.Bill;
import com.retail.springbootretailapplication.controller.BillController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { SpringbootRetailApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootRetailApplicationTests {

	@Autowired private TestRestTemplate restTemplate;

    @LocalServerPort private int port;

    @Autowired private BillController billController;
	@Test
	void contextLoads() {
		Assertions
        .assertThat(billController)
        .isNotNull();
	}
	@Test
    public void getAmount() {
        ResponseEntity<Iterable<Bill>> responseEntity = restTemplate.exchange("http://localhost:" + port + "/api/billamount", HttpMethod.GET, null, new ParameterizedTypeReference<Iterable<Bill>>() {
        });
}
}
