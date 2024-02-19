package com.kurly.lpims.infrastructure.adapter.out.jpa.mapper;

import com.kurly.lpims.domain.logisticsproduct.LogisticsProduct;
import com.kurly.lpims.infrastructure.adapter.out.jpa.entity.LogisticsProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface LogisticsProductEntityMapper {
    LogisticsProductEntity toEntity(LogisticsProduct domain);
    LogisticsProduct toDomain(LogisticsProductEntity entity);
}
