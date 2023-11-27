package com.mcss.msuser;

import io.grpc.Server;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MsUserApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(MsUserApplication.class, args);
    }

}
