package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.TeacherDTO;
import com.example.mapstruct.dto.UserDTO;
import com.example.mapstruct.model.Teacher;
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
public interface TeacherMapper {
    
    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);
    
    @Mapping(target = "name", expression = "java(teacher.getName())")
    @Mapping(target = "gender", expression = "java(formatFender(teacher.getGender()))")
    
    TeacherDTO to(Teacher teacher);
    
    default String formatFender(String gender) {
        return "M".equalsIgnoreCase(gender) ? "男" : "女";
    }
}
