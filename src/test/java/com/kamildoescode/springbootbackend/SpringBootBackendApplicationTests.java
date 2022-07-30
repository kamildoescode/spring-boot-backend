package com.kamildoescode.springbootbackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringBootBackendApplicationTests {

    @Test
    void contextLoads() {
        assertThat(Boolean.TRUE).isTrue();
    }
}
