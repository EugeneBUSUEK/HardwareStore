package com.example.hardwarestore.persist.db.postgres.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class ProducerEntity {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String address;
}
