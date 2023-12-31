package com.example.hardwarestore.persist.db.postgres.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
    private String name;
    @NonNull
    private String type;
    @NonNull
    private Double price;
    @Nullable
    private String description;
    @OneToOne
    private ProducerEntity producerEntity;
}
