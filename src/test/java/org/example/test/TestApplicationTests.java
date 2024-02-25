package org.example.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    TestApplication testApplication;

    @Test
    void contextLoads() {
    }

    @DisplayName("덧셈의 결과를 조회한다.")
    @Test
    void test() {
        // given
        int num1 = 1;
        int num2 = 3;

        // when
        int result = testApplication.plus(num1, num2);

        // then
        assertThat(result).isEqualTo(3);
    }

}
