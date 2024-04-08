package com.doenervergleich.back.doenervergleich.restaurant;


import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Restaurant updateRestaurantFromDto(RestaurantDto dto, @MappingTarget Restaurant entity);
}
