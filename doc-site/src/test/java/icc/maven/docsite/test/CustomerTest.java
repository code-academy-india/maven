package icc.maven.docsite.test;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	private Customer customer;
	
	@Before
	public void init() {
		customer = new Customer(10201, "Rajesh Khanna");
	}
	
	@Test
	public void validateCustomer() {
		int custId = customer.getId();
		assertEquals(10201, custId);
	}
	
	@After
	public void release() {
		customer = null;
	}
	
}
