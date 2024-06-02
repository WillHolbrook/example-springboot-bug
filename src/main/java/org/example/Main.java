package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SampleConfiguration.class);
        app.setHeadless(false);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}