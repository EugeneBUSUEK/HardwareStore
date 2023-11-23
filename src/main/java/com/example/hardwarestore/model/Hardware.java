package com.example.hardwarestore.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

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
