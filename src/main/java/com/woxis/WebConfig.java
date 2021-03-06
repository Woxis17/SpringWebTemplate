package com.woxis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Robert on 06-Jan-17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.woxis.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
}
