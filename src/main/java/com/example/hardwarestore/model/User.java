package com.example.hardwarestore.model;

import com.example.hardwarestore.helpers.ValidEmail;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    @NotBlank(message = "Имя пользователя должно быть заполнено")
    private String username;

    @ValidEmail
    @NotBlank(message = "Почта не может быть пустой")
    private String email;

    @NotBlank(message = "Пароль не может быть пустым")
    private String password;
}
