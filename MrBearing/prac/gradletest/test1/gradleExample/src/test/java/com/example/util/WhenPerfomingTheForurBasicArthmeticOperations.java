package com.example.util;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class WhenPerfomingTheForurBasicArthmeticOperations{
  public static class InAddeition{
    @Test
    public void shouldReturnTheSumOfNumbersWhichAreNumericString(){
      assertEquals(new BigDecimal(2),BasicArtihmetricOperations.plus("1","1"));
    }

    @Test
    public void shoudReturnTheSumOfNumbersWhichAreBigDecimal(){
      assertEquals(new BigDecimal(2),BasicArtihmetricOperations.plus(new BigDecimal(1),new BigDecimal(1)));
    }

  }
}
