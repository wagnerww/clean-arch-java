package com.wagnerww.cleanarch.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CategoryTest 
{

    @DisplayName("should create a new Category")
    @Test
    public void shouldNewCategory()
    {
        Assertions.assertNotNull(new Category());
    }
}
