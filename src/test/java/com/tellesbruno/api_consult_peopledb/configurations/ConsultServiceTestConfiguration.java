package com.tellesbruno.api_consult_peopledb.configurations;

import com.tellesbruno.api_consult_peopledb.services.ConsultService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("Service")
@Configuration
public class ConsultServiceTestConfiguration {
    @Bean
    @Primary
    public ConsultService consultServiceForTest(){
        return Mockito.mock(ConsultService.class);
    }
}
