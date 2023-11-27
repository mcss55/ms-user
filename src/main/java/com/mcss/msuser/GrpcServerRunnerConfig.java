package com.mcss.msuser;

import io.grpc.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GrpcServerRunnerConfig {

    @Bean
    CommandLineRunner keepServerRunning(Server grpcServer) {
        return args -> {
            grpcServer.awaitTermination();
        };
    }
}
