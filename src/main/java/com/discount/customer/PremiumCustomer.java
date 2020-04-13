package com.discount.customer;

public class PremiumCustomer implements CustomerStrategy {

	public long applyDiscount(long amount) {
		if(amount<0){
			throw new RuntimeException();
		}
		if ((amount > 0) && (amount <= 4000)) {
			return ((amount)- percentCalculate(amount, 10));
		} else if ((amount > 4000) && (amount <= 8000)) {			
			return amount - percentCalculate(4000, 10)-percentCalculate((amount-4000), 15);
			
		}else if ((amount > 8000) && (amount <= 12000)) {
			return amount - percentCalculate(4000, 10)-percentCalculate(4000, 15)-percentCalculate((amount-4000-4000), 20);
			
		} else{
			return amount - percentCalculate(4000, 10)-percentCalculate(4000, 15)-percentCalculate(4000, 20)-percentCalculate((amount-4000-4000-4000), 30);
		}
	}
	
	
	private long percentCalculate(long amt, int percent){
		return amt*percent/100;
	}

}
