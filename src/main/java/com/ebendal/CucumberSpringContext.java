package com.ebendal;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberSpringContext.Application.class)
public class CucumberSpringContext {

    @SpringBootApplication
    static class Application {
    }
}
