package pl.pjatk.RentalService.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NewBean {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
