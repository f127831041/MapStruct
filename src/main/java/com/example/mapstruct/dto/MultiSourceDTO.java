package com.example.mapstruct.dto;

/**
 * @Author viper
 * @Date 2023/2/7 上午 11:34
 * @Version 1.0
 */
public class MultiSourceDTO {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String job;
    private String nationNo;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
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
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getNationNo() {
        return nationNo;
    }
    
    public void setNationNo(String nationNo) {
        this.nationNo = nationNo;
    }
}
