package com.nito.rest.api.user;

import com.nito.core.usecase.createuser.CreateUserCommand;
import com.nito.core.usecase.createuser.CreateUserUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@UserController
public class CreateUserController {
    private final CreateUserUseCase createUserUseCase;

    @Autowired
    public CreateUserController(final CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<Integer> createUser(@RequestBody final CreateUserCommand command) {
        log.info("Request: /user | Body: {}", command);
        return new ResponseEntity<>(createUserUseCase.createUser(command), CREATED);
    }
}
