package com.spring.monitoring;

import com.spring.monitoring.order.v0.OrderConfigV0;
import com.spring.monitoring.order.v1.OrderConfigV1;
import com.spring.monitoring.order.v2.OrderConfigV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(OrderConfigV2.class)
@SpringBootApplication(scanBasePackages = "com.spring.monitoring.controller")
public class MonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringApplication.class, args);
	}

	@Bean
	public InMemoryHttpExchangeRepository httpExchangeRepository() {
		return new InMemoryHttpExchangeRepository();
	}
}