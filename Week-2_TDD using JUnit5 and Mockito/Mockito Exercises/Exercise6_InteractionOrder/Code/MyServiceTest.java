package com.yuvarajan;

import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.stepOne();
        mockApi.stepTwo();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).stepOne();
        inOrder.verify(mockApi).stepTwo();
    }
}