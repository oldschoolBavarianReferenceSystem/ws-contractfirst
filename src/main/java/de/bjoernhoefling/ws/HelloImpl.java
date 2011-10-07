/**
 * 
 */
package de.bjoernhoefling.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import de.bjoernhoefling.ws.stub.Hello;

/**
 * @author hoeflinb
 *
 */
@WebService(name="Hello", endpointInterface ="de.bjoernhoefling.ws.stub.Hello")
public class HelloImpl implements Hello {

	private static final String HELLO = "Hello";

	/* (non-Javadoc)
	 * @see de.bjoernhoefling.ws.stub.Hello#greet()
	 */
	@Override
	@WebMethod
	public String greet() {
		return HELLO;
	}

}
