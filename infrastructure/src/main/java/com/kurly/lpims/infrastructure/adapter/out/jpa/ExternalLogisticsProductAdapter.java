package com.kurly.lpims.infrastructure.adapter.out.jpa;

import com.kurly.lpims.application.port.out.external.ExternalLogisticsProductPort;
import com.kurly.lpims.domain.logisticsproduct.LogisticsProduct;
import com.kurly.lpims.infrastructure.adapter.out.jpa.entity.LogisticsProductEntity;
import com.kurly.lpims.infrastructure.adapter.out.jpa.mapper.LogisticsProductEntityMapper;
import com.kurly.lpims.infrastructure.adapter.out.jpa.repository.LogisticsProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExternalLogisticsProductAdapter implements ExternalLogisticsProductPort {

    private final LogisticsProductRepository logisticsProductRepository;
    private final LogisticsProductEntityMapper logisticsProductEntityMapper;

    @Override
    public Page<LogisticsProduct> findLogisticsProduct(Pageable pageable) {
        return new PageImpl<>(logisticsProductRepository.findAll(pageable)
                .stream()
                .map(logisticsProductEntityMapper::toDomain)
                .toList());
    }

    @Override
    public Optional<LogisticsProduct> getLogisticsProduct(Long logisticsProductId) {
        return logisticsProductRepository.findById(logisticsProductId)
                .map(logisticsProductEntityMapper::toDomain);

    }

    @Override
    public void saveLogisticsProduct(LogisticsProduct logisticsProduct) {
        LogisticsProductEntity logisticsProductEntity = logisticsProductEntityMapper.toEntity(logisticsProduct);
        logisticsProductRepository.save(logisticsProductEntity);
    }

    @Override
    public LogisticsProduct updateLogisticsProduct(LogisticsProduct logisticsProduct) {
        return null;
    }

    @Override
    public void deleteLogisticsProduct(Long logisticsProductId) {

    }
}
