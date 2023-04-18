package com.nito.core.usecase.createuser;

import java.time.LocalDateTime;

public record CreateUserCommand(
        String email,
        String username,
        String password,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
}