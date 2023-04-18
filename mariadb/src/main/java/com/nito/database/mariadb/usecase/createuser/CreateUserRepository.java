package com.nito.database.mariadb.usecase.createuser;

import com.nito.database.mariadb.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CreateUserRepository extends JpaRepository<UserEntity, Integer> {
}
