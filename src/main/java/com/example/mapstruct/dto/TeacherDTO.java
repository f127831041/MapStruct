package com.example.mapstruct.dto;

/**
 * @Author viper
 * @Date 2023/2/6 下午 05:49
 * @Version 1.0
 */
public class TeacherDTO {
    private String name;
    private String gender;
    private Integer age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
}
