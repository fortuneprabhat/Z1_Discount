package com.discount.customer;

public class RegularCustomer implements CustomerStrategy {

	public long applyDiscount(long amount) {
		
		if(amount<0){
			throw new RuntimeException();
		}

		if ((amount > 0) && (amount <= 5000)) {
			return amount;
			
		} else if ((amount > 5000) && (amount <= 10000)) {
			return amount - percentCalculate(5000, 10);
			
		} else {
			return amount - percentCalculate(5000, 10) - percentCalculate(amount-10000, 20);
		}
	}
	
	private long percentCalculate(long amt, int percent){
		return amt*percent/100;
	}
}
