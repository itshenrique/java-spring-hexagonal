package com.nito.core.usecase.createuser;

@FunctionalInterface
public interface CreateUserUseCase {
    Integer createUser(CreateUserCommand command);
}