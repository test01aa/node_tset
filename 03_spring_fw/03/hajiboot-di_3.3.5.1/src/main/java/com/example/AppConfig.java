package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Autowired
    DataSourceProperties properties;
    DataSource dataSource;

    @Bean(destroyMethod = "close")
    DataSource realDataSource() {
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.properties.getClassLoader())
                .url(this.properties.getUrl())
                .username(this.properties.getUsername())
                .password(this.properties.getPassword());
        this.dataSource = factory.build();
        return this.dataSource;
    }
    
    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Bean
    CharacterEncodingFilter characterEncodingFilter(){
    	CharacterEncodingFilter filter = new CharacterEncodingFilter();
    	filter.setEncoding("UTF-8");
    	filter.setForceEncoding(true);
    	return filter;
    }

}
