package com.kurly.lpims.infrastructure.adapter.out.jpa.mapper.base;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface BaseMapper<SOURCE, TARGET> {
    SOURCE toDto(TARGET t);

    SOURCE toEntity(TARGET t);

    TARGET toDomain(SOURCE s);

    //nullValuePropertyMappingStrategy: Source 의 필드가 null 일 때의 정책 [SET_TO_NULL(기본값), SET_TO_DEFAULT, IGNORE]
    //여기서는 null 값인 것들은 무시한다.
    //mappingTarget: 파라미터로 받아 업데이트할 객체 설정한다.
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDomain(SOURCE source, @MappingTarget TARGET target);
}