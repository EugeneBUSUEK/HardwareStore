package com.example.hardwarestore.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Hardware {
    @NotBlank(message = "Название не может быть пустым")
    private String name;

    @NotBlank(message = "Тип не может быть пустым")
    private String type;

    @NotNull(message = "Цена не может быть пустой")
    private Double price;

    private String description;
    private String producerId;

    // остальные поля...

    // геттеры и сеттеры
}
