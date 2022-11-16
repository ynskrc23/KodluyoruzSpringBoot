package com.karaca.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanDto;

    public void initialBeanMethod(){
        log.info("bean başlamadan önce ben varın");
        System.out.println("bean başlamadan önce çalışacak metot");
    }

    public void destroyBeanMethod(){
        log.info("bean bittikten önce ben varın");
        System.err.println("bean bittikten sonra çalışacak metot");
    }
}
