package com.ebendal;

import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class TestStepDefinitions {

    @Autowired
    private MySpringComponent mySpringComponent;

    @Then("My Spring context is loaded")
    public void iUseMySpringComponent() {
        assertThat(mySpringComponent).isNotNull();
    }
}
