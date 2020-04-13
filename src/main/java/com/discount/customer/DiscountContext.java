package com.discount.customer;

public class DiscountContext {
	
	private CustomerStrategy discount;

	public DiscountContext(CustomerStrategy discount) {
		this.discount = discount;
	}
	
	public long calculateTotal(int amt){
		return this.discount.applyDiscount(amt);
	}
}
