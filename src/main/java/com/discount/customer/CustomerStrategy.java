package com.discount.customer;

@FunctionalInterface
public interface CustomerStrategy {
	public long applyDiscount(long amount);
}
