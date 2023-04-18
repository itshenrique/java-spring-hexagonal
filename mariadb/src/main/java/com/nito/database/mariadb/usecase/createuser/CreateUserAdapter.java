package com.nito.database.mariadb.usecase.createuser;

import com.nito.database.mariadb.domain.UserEntity;
import com.nito.core.domain.User;
import com.nito.core.usecase.createuser.CreateUserPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CreateUserAdapter implements CreateUserPort {

    private final CreateUserRepository createUserRepository;

    @Autowired
    public CreateUserAdapter(final CreateUserRepository createUserRepository) {
        this.createUserRepository = createUserRepository;
    }

    @Override
    public Integer createUser(final User User) {
        final var UserEntity = new UserEntity(User.email(), User.username(), User.password());
        log.info("[MariaDb] Create User: {}", UserEntity);
        return createUserRepository.save(UserEntity).getId();
    }
}