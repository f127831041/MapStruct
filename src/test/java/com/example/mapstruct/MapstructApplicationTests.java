package com.example.mapstruct;

import com.example.mapstruct.dto.UserDTO;
import com.example.mapstruct.mapper.UserMapper;
import com.example.mapstruct.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MapstructApplicationTests {
    
    
    @Test
    void contextLoads() {
        int id = 123;
        String name = "viper";
        String job = "computer";
        User user = new User();
        user.setId(123);
        user.setName("viper");
        user.setJob("computer");
        UserDTO dto = UserMapper.INSTANCE.to(user);
        
        assertEquals(id,dto.getId());
        assertEquals(name,dto.getName());
        assertEquals(job,dto.getJob());
    }
    
}
