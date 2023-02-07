package com.example.mapstruct.dto;

/**
 * @Author viper
 * @Date 2023/2/6 下午 05:17
 * @Version 1.0
 */
public class UserDTO {
    private Integer id;
    private String name;
    private String job;
    private String nation;
    
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
    
    public String getNation() {
        return nation;
    }
    
    public void setNation(String nation) {
        this.nation = nation;
    }
}
