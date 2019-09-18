package com.sangkon.model.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

// 1. User 클래스의 객체는 builder()로 생성되어야 한다.
    @Test
    public void createPojoUserBuilder() {
        User user = User.builder().build();
        assertThat(user).isNotNull();
    }

    @Autowired
    MockMvc mockMvc;

// 2. POJO(Plain Old Java Object)의 첫 번째 특성인 기본 생성자
    @Test
    public void createPojoUserConstructor() {

        User user = User.builder()
                .id(10L)
                .name("Mike")
                .email("Mike@test.com")
                .build();

//        mockMvc.perform(
//
//        )

    }

// 3. POJO의 특성인 Setter/Getter
//    @Test
//    public void createPojoUserSetterGetter() {
//    }

// 4. POJO의 특성인 id(unique)
//    @Test
//    public void createPojoUserById() {
//    }

}