package com.discount.main;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.discount.customer.DiscountContext;
import com.discount.customer.RegularCustomer;

import org.junit.Assert;


public class RegularCustomerTest {
	private DiscountContext con;
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	@Before
    public void before() throws Exception {
        con = new DiscountContext(new RegularCustomer());
        Assert.assertNotNull(con);
    }
	
	@Test
	public void invalidAmount(){
		exceptionRule.expect(RuntimeException.class);
		con.calculateTotal(-100);	
	}
	
	@Test
	public void applyDiscountTest(){
		Assert.assertEquals(5000, con.calculateTotal(5000));
		Assert.assertEquals(9500, con.calculateTotal(10000));
		Assert.assertEquals(13500, con.calculateTotal(15000));
	}
	
	@After 
    public void after() throws Exception {
        System.out.println("Running: tearDown");
        con = null;
        Assert.assertNull(con);
    }
}
