package com.wagnerww.cleanarch.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UseCaseTest 
{

    @DisplayName("Test use case")
    @Test
    public void shouldUseCaseTest()
    {
        assertNotNull(new UseCase());
        assertNotNull(new UseCase().execute());
    }
}
