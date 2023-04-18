package com.nito.core.domain;

import java.time.LocalDateTime;

public record User(
        Integer id,
        String email,
        String username,
        String password,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
}
