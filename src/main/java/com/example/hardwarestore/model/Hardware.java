package com.example.hardwarestore.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Hardware {
    @NotBlank(message = "This field should not be empty")
    private String name;
    @NotBlank(message = "This field should not be empty")
    private String type;

    // остальные поля...

    // геттеры и сеттеры
}
