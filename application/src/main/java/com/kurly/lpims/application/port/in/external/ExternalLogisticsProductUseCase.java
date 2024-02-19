package com.kurly.lpims.application.port.in.external;

import com.kurly.lpims.domain.logisticsproduct.LogisticsProduct;

public interface ExternalLogisticsProductUseCase {
    void saveLogisticsProduct(LogisticsProduct logisticsProduct);

    LogisticsProduct updateLogisticsProduct(LogisticsProduct logisticsProduct);

    void deleteLogisticsProduct(Long logisticsProductId);
}
