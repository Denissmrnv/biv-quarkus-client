package com.example;

import com.example.service.ProductService;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class Scheduler {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Inject
    @RestClient
    ProductService productService;

    @Scheduled(every = "3s")
    public void testScheduler(){
        this.logger.info("Get products " + productService.getAllProducts());
    }
}
