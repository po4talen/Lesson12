package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
 //   @DisplayName("Triangle test")
    public void Test1(){
        Assert.assertEquals(5,Triangle.areaTriangle(4,4,5), 1.0);
    }
}
