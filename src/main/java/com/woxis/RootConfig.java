package com.woxis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by robertz on 03/02/2017.
 */
@Configuration
@ComponentScan(
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern="com.woxis.controller.*")
        }
)
public class RootConfig {
}
