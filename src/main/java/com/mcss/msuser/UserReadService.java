package com.mcss.msuser;

import com.mcss.grpc.lib.UserReadRequest;
import com.mcss.grpc.lib.UserReadResponse;
import com.mcss.grpc.lib.UserReadServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserReadService extends UserReadServiceGrpc.UserReadServiceImplBase{

    private final UserRepository userRepository;


    @Override
    public void readUser(UserReadRequest request, StreamObserver<UserReadResponse> responseObserver) {
        User user = userRepository.findById(request.getId()).orElseThrow();
        UserReadResponse response = UserReadResponse.newBuilder()
                .setId(user.getId())
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .addAllCourses(user.getCourses())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
