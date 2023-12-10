package com.example.hardwarestore.persist.db.postgres;

import com.example.hardwarestore.persist.db.postgres.entity.ProducerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProducerRepository extends JpaRepository<ProducerEntity, UUID> {
}
