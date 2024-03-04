package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
    //해결 1
    //    @Autowired
//    Food pizza;
//    @Autowired
//    Food chicken;
//
//    @Test
//    @DisplayName("Food 테스트")
//    void test1(){
//        pizza.eat();
//        chicken.eat();
//    }

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Food 테스트")
    void test2(){
        food.eat();
    }

}