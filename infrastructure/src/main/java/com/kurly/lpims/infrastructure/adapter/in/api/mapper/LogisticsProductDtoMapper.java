package com.kurly.lpims.infrastructure.adapter.in.api.mapper;

import com.kurly.lpims.domain.logisticsproduct.LogisticsProduct;
import com.kurly.lpims.infrastructure.adapter.in.api.dto.ExternalLogisticsProductDto;
import com.kurly.lpims.infrastructure.adapter.in.api.dto.InternalLogisticsProductDto;
import org.mapstruct.Mapper;

@Mapper
public interface LogisticsProductDtoMapper {

    LogisticsProduct toDomain(ExternalLogisticsProductDto dto);

    LogisticsProduct toDomain(InternalLogisticsProductDto dto);
}
