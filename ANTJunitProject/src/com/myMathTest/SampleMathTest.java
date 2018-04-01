package com.myMathTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleMathTest {

	
	  @Test
		public void testSum() {
			assertEquals(10+10, 20);
		}
		@Test
		public void testProduct() {
			assertEquals(10*10, 20);
		}
	}

