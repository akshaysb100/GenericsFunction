package com.generic.com;

import org.junit.Assert;
import org.junit.Test;

public class NewTestClass {


    @Test
    public void givenNumber_isMaximum_Return() {

      MaximumValue maximumValue = new MaximumValue();
      Assert.assertEquals(3,maximumValue.checkIntegerMax());
    }
}
