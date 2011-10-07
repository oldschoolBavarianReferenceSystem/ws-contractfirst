package de.bjoernhoefling.ws;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.bjoernhoefling.ws.stub.Hello;

public class HelloServiceTest {

	Hello helloService = null;
	@Before
	public void setUp() throws Exception {
		helloService = new HelloImpl();
	}

	@Test
	public void testSayHello() {
		assertEquals("HelloService does not say 'Hello'", "Hello", helloService.greet());
	}

}
