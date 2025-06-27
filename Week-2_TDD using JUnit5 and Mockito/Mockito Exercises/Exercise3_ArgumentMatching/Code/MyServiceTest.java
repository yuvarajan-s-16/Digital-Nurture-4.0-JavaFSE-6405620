package com.yuvarajan;

import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.process("hello yuvarajan");
        verify(mockApi).process(eq("hello yuvarajan"));  // exact match
        verify(mockApi).process(anyString());  // any string
    }
}