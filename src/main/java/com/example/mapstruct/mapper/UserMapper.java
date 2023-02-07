package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.UserDTO;
import com.example.mapstruct.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Author viper
 * @Date 2023/2/6 下午 05:19
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    
    @Mapping(source = "nationNo", target = "nation")
    
    UserDTO to(User user);
}
