package com.itprom.jet.ship.configuration;

import com.itprom.jet.common.processor.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagesConfig {

    @Bean
    public MessageConverter converter(){
        return new MessageConverter();
    }
}
