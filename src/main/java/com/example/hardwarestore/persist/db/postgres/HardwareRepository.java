package com.example.hardwarestore.persist.db.postgres;

import com.example.hardwarestore.persist.db.postgres.entity.HardwareEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HardwareRepository extends JpaRepository<HardwareEntity, UUID> {
}
