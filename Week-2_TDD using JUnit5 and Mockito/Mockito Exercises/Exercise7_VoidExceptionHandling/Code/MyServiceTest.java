package com.yuvarajan;

import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testVoidMethodWithException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Failed")).when(mockApi).sendData(anyString());

        try {
            mockApi.sendData("test");
        } catch (RuntimeException e) {
            assert(e.getMessage().equals("Failed"));
        }

        verify(mockApi).sendData("test");
    }
}