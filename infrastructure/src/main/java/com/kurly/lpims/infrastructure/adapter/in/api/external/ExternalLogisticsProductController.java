package com.kurly.lpims.infrastructure.adapter.in.api.external;

import com.kurly.lpims.application.port.in.external.ExternalLogisticsProductUseCase;
import com.kurly.lpims.infrastructure.adapter.in.api.dto.ExternalLogisticsProductDto;
import com.kurly.lpims.infrastructure.adapter.in.api.mapper.LogisticsProductDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExternalLogisticsProductController {

    private final ExternalLogisticsProductUseCase logisticsProductUseCase;
    private final LogisticsProductDtoMapper logisticsProductDtoMapper;

    @PostMapping("/v1/external/logistics-product")
    public void saveLogisticsProduct(ExternalLogisticsProductDto dto) {
        logisticsProductUseCase.saveLogisticsProduct(logisticsProductDtoMapper.toDomain(dto));
    }

    @PutMapping("/v1/external/logistics-product")
    public void updateLogisticsProduct(ExternalLogisticsProductDto dto) {
        logisticsProductUseCase.updateLogisticsProduct(logisticsProductDtoMapper.toDomain(dto));
    }

    @DeleteMapping("/v1/external/logistics-product")
    public void deleteLogisticsProduct(Long logisticsProductId) {
        logisticsProductUseCase.deleteLogisticsProduct(logisticsProductId);
    }
}
