package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class BeenConfiguration {

    @Bean
    public AtomicInteger getAtomicInteger(){
        return new AtomicInteger();
    }
}
