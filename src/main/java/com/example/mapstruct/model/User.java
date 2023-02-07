package com.example.mapstruct.model;

/**
 * @Author viper
 * @Date 2023/2/6 下午 05:16
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String name;
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
