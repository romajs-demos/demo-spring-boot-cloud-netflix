package romajs.demo.springcloudnetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbineStreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineStreamApplication.class, args);
    }
}
