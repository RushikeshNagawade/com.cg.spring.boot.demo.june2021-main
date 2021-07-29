package com.cg.spring.boot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;

@SpringBootTest
class ApplicationTests {
	private static Logger LOG = LoggerFactory.getLogger(ApplicationTests.class);

	// positive test case
	@Test
	public void testHello() {
		
		LOG.info("testhello");
		Hello obj = new Hello();
		
		String expected ="Hello world!";
		String actual = obj.hello();
		
		assertEquals(expected, actual);
	}
	
	// negative test case
	@Test
	public void testHello2() {
		
		LOG.info("testhello");
		Hello obj = new Hello();
		
		String unexpected ="aaaa";
		String actual = obj.hello();
		
		assertNotEquals(unexpected, actual);
	}
}
