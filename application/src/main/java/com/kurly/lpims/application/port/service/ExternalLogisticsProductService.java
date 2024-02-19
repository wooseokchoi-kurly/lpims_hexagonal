package com.kurly.lpims.application.port.service;

import com.kurly.lpims.application.port.in.external.ExternalLogisticsProductUseCase;
import com.kurly.lpims.application.port.out.external.ExternalLogisticsProductPort;
import com.kurly.lpims.domain.logisticsproduct.LogisticsProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ExternalLogisticsProductService implements ExternalLogisticsProductUseCase {

    private final ExternalLogisticsProductPort externalLogisticsProductPort;

    @Override
    @Transactional
    public void saveLogisticsProduct(LogisticsProduct logisticsProduct) {
        externalLogisticsProductPort.saveLogisticsProduct(logisticsProduct);
    }

    @Override
    @Transactional
    public LogisticsProduct updateLogisticsProduct(LogisticsProduct logisticsProduct) {
        return externalLogisticsProductPort.updateLogisticsProduct(logisticsProduct);
    }

    @Override
    @Transactional
    public void deleteLogisticsProduct(Long logisticsProductId) {
        externalLogisticsProductPort.getLogisticsProduct(logisticsProductId)
                .ifPresentOrElse(it -> {
                    externalLogisticsProductPort.deleteLogisticsProduct(logisticsProductId);
                }, () -> {
                    throw new RuntimeException();
                });
    }
}
