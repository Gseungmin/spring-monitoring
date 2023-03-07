package com.spring.monitoring.order.v2;

import com.spring.monitoring.order.OrderService;
import com.spring.monitoring.order.v1.OrderServiceV1;
import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfigV2 {
    @Bean
    public OrderService orderService() {
        return new OrderServiceV2();
    }
    @Bean
    public CountedAspect countedAspect(MeterRegistry registry) {
        return new CountedAspect(registry);
    }
}