package com.kurly.lpims.application.port.out.external;

import com.kurly.lpims.domain.logisticsproduct.LogisticsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ExternalLogisticsProductPort {

    Page<LogisticsProduct> findLogisticsProduct(Pageable pageable);

    Optional<LogisticsProduct> getLogisticsProduct(Long logisticsProductId);

    void saveLogisticsProduct(LogisticsProduct logisticsProduct);

    LogisticsProduct updateLogisticsProduct(LogisticsProduct logisticsProduct);

    void deleteLogisticsProduct(Long logisticsProductId);
}
