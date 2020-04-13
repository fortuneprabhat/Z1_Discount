package com.discount.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.discount.customer.DiscountContext;
import com.discount.customer.PremiumCustomer;

import org.junit.Assert;


public class PremiumCustomerTest {
	private DiscountContext con;
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	@Before
    public void before() throws Exception {
        con = new DiscountContext(new PremiumCustomer());
        Assert.assertNotNull(con);
    }
	
	@Test
	public void invalidAmount(){
		exceptionRule.expect(RuntimeException.class);
		con.calculateTotal(-100);	
	}
	
	@Test
	public void applyDiscountTest(){
		Assert.assertEquals(3600, con.calculateTotal(4000));
		Assert.assertEquals(7000, con.calculateTotal(8000));
		Assert.assertEquals(10200, con.calculateTotal(12000));
		Assert.assertEquals(15800, con.calculateTotal(20000));
	}
	
	
	
	@After 
    public void after() throws Exception {
        con = null;
        Assert.assertNull(con);
    }

}
