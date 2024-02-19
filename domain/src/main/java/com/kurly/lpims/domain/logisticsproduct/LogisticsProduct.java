package com.kurly.lpims.domain.logisticsproduct;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogisticsProduct {
    private String standardCode;
    private String generalProductCode;
    private String sourcingType;
    private Integer boxPerQnty;
    private Integer width;
    private Integer length;
    private Integer height;
    private Integer cbm;
    private String productImage;
    private String unit;
    private String owner;
    private String kurlyMallProductCode;
    private String kurlyKeepType;
    private String stockSafeDate;
    private String useStatus;
}
