package com.kurly.lpims.infrastructure.adapter.out.jpa.entity;

import com.kurly.lpims.infrastructure.adapter.out.jpa.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicUpdate
@Getter
@Setter
@Entity
//@Table(name = "logistics_product", schema = "lpims")
@Table(name = "logistics_product", schema = "wms_inventory")
public class LogisticsProductEntity extends BaseEntity implements Serializable {

    @Id
    private Long id;

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
