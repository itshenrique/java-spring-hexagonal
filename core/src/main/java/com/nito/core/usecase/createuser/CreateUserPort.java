package com.nito.core.usecase.createuser;

import com.nito.core.domain.User;

@FunctionalInterface
public interface CreateUserPort {
    Integer createUser(User user);
}
