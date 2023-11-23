package com.example.hardwarestore.model;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Hardware {
    @NotBlank(message = "Поле не должно быть пустым")
    private String type;

    @NotBlank(message = "Поле не должно быть пустым")
    private String name;

    // остальные поля...

    // геттеры и сеттеры
}
