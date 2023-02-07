package com.example.mapstruct.controller;

import com.example.mapstruct.PaymentType;
import com.example.mapstruct.PaymentTypeView;
import com.example.mapstruct.dto.MultiSourceDTO;
import com.example.mapstruct.dto.TeacherDTO;
import com.example.mapstruct.dto.UserDTO;
import com.example.mapstruct.mapper.MultiSourceMapper;
import com.example.mapstruct.mapper.PaymentTypeMapper;
import com.example.mapstruct.mapper.TeacherMapper;
import com.example.mapstruct.mapper.UserMapper;
import com.example.mapstruct.model.Teacher;
import com.example.mapstruct.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author viper
 * @Date 2023/2/6 下午 05:37
 * @Version 1.0
 */
@RestController
public class TestController {
    
    @GetMapping("/user")
    private UserDTO getUser(){
        User user = new User();
        user.setId(123);
        user.setName("viper");
        user.setJob("computer");
        user.setNationNo("TW");
        return UserMapper.INSTANCE.to(user);
    }
    
    @GetMapping("/teacher")
    private TeacherDTO getTeacher(){
        Teacher teacher = new Teacher();
        teacher.setAge(20);
        teacher.setName("tom");
        teacher.setGender("M");
        return TeacherMapper.INSTANCE.to(teacher);
    }
    
    @GetMapping("payment")
    private PaymentTypeView getPayment() {
        PaymentType paymentType = PaymentType.CARD_CREDIT;
        return PaymentTypeMapper.INSTANCE.to(paymentType);
    }
    
    @GetMapping("multi")
    private MultiSourceDTO getMultiContent() {
        User user = new User();
        user.setId(123);
        user.setName("viper");
        user.setJob("computer");
        user.setNationNo("TW");
    
        Teacher teacher = new Teacher();
        teacher.setAge(20);
        teacher.setName("tom");
        teacher.setGender("M");
        return MultiSourceMapper.INSTANCE.to(teacher,user);
    }
    
}
