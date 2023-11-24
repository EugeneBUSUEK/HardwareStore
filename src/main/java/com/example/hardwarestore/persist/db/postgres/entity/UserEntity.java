package com.example.hardwarestore.persist.db.postgres.entity;

import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue
    private UUID id;
    @NonNull
    private String username;
    @NonNull
    private String password;

    private String role;
}
