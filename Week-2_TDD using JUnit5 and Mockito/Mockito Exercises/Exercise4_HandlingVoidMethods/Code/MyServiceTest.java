package com.yuvarajan;

import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).sendData(anyString());

        mockApi.sendData("test");

        verify(mockApi).sendData("test");
    }
}