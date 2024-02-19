package com.kurly.lpims.infrastructure.adapter.out.jpa.repository;

import com.kurly.lpims.infrastructure.adapter.out.jpa.entity.LogisticsProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogisticsProductRepository extends JpaRepository<LogisticsProductEntity, Long> {
}
