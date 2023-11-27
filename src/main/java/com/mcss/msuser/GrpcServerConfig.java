package com.mcss.msuser;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    private final List<BindableService> grpcServices;

    public GrpcServerConfig(List<BindableService> grpcServices) {
        this.grpcServices = grpcServices;
    }

    @Bean
    public Server grpcServer() throws IOException {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(8082);
        grpcServices.forEach(serverBuilder::addService);

        Server server = serverBuilder.build();
        server.start();
        return server;
    }
}