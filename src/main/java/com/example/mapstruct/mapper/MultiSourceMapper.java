package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.MultiSourceDTO;
import com.example.mapstruct.model.Teacher;
import com.example.mapstruct.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Author viper
 * @Date 2023/2/7 上午 11:16
 * @Version 1.0
 */
@Mapper
public interface MultiSourceMapper {
    MultiSourceMapper INSTANCE = Mappers.getMapper(MultiSourceMapper.class);
    
    @Mapping(source = "teacher.name", target = "name")
    
    MultiSourceDTO to(Teacher teacher, User user);
    
}
