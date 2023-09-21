package com.example.dasom.mapper;

import com.example.dasom.domain.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Transactional
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void findUserId() {

        UserDto userDto = new UserDto();
        userDto.setUserName("abb");
        userDto.setUserPhone("01049432518");
        userDto.setUserBirthYear("2022");
        userDto.setUserBirthMonth("1");
        userDto.setUserBirthDay("12");


        UserDto foundUser = userMapper.findUserId(userDto);


        assertNotNull(foundUser);

    }
}