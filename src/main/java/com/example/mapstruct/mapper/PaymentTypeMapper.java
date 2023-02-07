package com.example.mapstruct.mapper;

import com.example.mapstruct.PaymentType;
import com.example.mapstruct.PaymentTypeView;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

/**
 * @Author viper
 * @Date 2023/2/7 上午 10:53
 * @Version 1.0
 */
@Mapper
public interface PaymentTypeMapper {
    
    PaymentTypeMapper INSTANCE = Mappers.getMapper(PaymentTypeMapper.class);
    
    @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "CARD")
    
    PaymentTypeView to(PaymentType paymentType);
}
