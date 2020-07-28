package com.osfocus.tdd.mock.basic;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTester {
    @Mock
    private Processor1 processor1;

    @Mock
    private Processor2 processor2;

    @Test
    public void testAddNormal() {
        Processor1 p1 = new Processor1();
        Processor2 p2 = new Processor2();

        Calculator calculator = new Calculator(p1, p2);
        assertEquals(15L, calculator.add(1, 2));
    }

    @Test
    public void testAddMock() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(processor1.process(ArgumentMatchers.anyLong())).thenReturn(20L);
        Mockito.when(processor2.process(ArgumentMatchers.anyLong())).thenReturn(10L);

        Calculator calculator = new Calculator(processor1, processor2);
        assertEquals(30L, calculator.add(1, 2));
    }
}
