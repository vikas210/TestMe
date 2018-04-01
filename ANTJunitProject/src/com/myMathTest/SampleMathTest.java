package com.myMathTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleMathTest {

	
	  @Test
		void testSum() {
			assertEquals(10+10, 20);
		}
		@Test
		void testProduct() {
			assertEquals(10*10, 20);
		}
	}

