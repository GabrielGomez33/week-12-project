package com.promineotech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class TestDemoJUnitTest {

    private TestDemo testDemo;

    @BeforeEach
    public void setUp() {
        testDemo = new TestDemo();
    }

    @Test
    public void assertThatNumberSquaredIsCorrect() {
        TestDemo mockDemo = spy(testDemo);
        doReturn(5).when(mockDemo).getRandomInt();

        int fiveSquared = mockDemo.randomNumberSquared();

        assertThat(fiveSquared).isEqualTo(25);
    }
}
