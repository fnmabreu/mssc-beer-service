package guru.sfg.beer.service.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fabreu on 05/12/2021
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(@Value("${sfg.brewery.inventory-user}") String inventoryUser,
                                                                   @Value("${sfg.brewery.inventory-password}") String inventoryPassword) {
        return new BasicAuthRequestInterceptor(inventoryUser, inventoryPassword);
    }

}
