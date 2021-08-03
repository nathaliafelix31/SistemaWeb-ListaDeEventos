package com.eventoapp.eventoapp;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;



@Configuration
@Profile("prod")
public class DataConfiguration{

    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(postgres://ikzspbdcwuyfum:c96b6cc3b645886176056ba7680437add46d13060b509f00dc11c6863be42e1e@ec2-3-233-43-103.compute-1.amazonaws.com:5432/dfmf658annb9ga);
        basicDataSource.setUsername(ikzspbdcwuyfum);
        basicDataSource.setPassword(c96b6cc3b645886176056ba7680437add46d13060b509f00dc11c6863be42e1e);

        return basicDataSource;
    }
}