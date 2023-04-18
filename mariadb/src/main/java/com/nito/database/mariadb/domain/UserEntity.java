package com.nito.database.mariadb.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 280, unique = true)
    private String email;

    @Column(nullable = false, length = 280, unique = true)
    private String username;

    @Column(nullable = false, length = 280)
    private String password;

    @CreatedDate
    @Column()
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column()
    private LocalDateTime updatedAt;

    public UserEntity(String email, String username, String password) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));
        this.email = email;
        this.username = username;
        this.password = password;
        this.createdAt = now;
        this.updatedAt = now;
    }
}
