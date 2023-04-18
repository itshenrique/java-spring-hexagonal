package com.nito.core.usecase.createuser;

import com.nito.core.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements CreateUserUseCase {
    private final CreateUserPort createUserPort;

    @Autowired
    public CreateUserService(final CreateUserPort createUserPort) {
        this.createUserPort = createUserPort;
    }

    @Override
    public Integer createUser(final CreateUserCommand command) {
        final var user = new User(null, command.email(), command.username(), command.password(), null, null);
        return createUserPort.createUser(user);
    }
}
