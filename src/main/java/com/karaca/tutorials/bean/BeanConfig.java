package com.karaca.tutorials.bean;

import com.karaca.tutorials.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
    public BeanDto beanDto(){

        return BeanDto
                .builder()
                    .id(0L).beanName("bean name").beanDto("bean data")
                .build();
    }
}
