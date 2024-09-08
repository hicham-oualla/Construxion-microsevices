
package com.example.gateway.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//1
@Configuration
public class Appconfig {




    @Bean
    public HttpMessageConverters customConverters() {
        // You can add custom converters here if needed
        return new HttpMessageConverters();
    }
}


