package ll.labs.service.dashboardservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;


@Configuration
@EnableAutoConfiguration
@EnableTurbineStream
@EnableDiscoveryClient
public class DashboardServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DashboardServiceApplication.class).run(args);
    }
}

