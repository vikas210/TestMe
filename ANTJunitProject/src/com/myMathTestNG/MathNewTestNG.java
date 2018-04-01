package com.myMathTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MathNewTestNG {
  
   @Test
  public void testPass() {
		Assert.assertEquals(10, 5+5);
  }
   
   
   @Test
   public void testFail() {
 		Assert.assertEquals(20, 15+5);
   }
}
