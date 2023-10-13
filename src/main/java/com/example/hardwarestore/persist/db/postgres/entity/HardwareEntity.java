package com.example.hardwarestore.persist.db.postgres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class HardwareEntity {

    @Id
    @GeneratedValue
    private UUID id;
    @NonNull
    private String type;
}
