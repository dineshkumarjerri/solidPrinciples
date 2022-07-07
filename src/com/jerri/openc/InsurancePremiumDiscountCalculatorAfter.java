package com.jerri.openc;

import java.util.Random;

/**
 * 
 * @author Dinesh J
 *
 * Open Closed Principle
 *  Software components, should be closed for modification, but open for extension.
 *  In below code we have created one Interface which is super to all customers, from that we can have 
 *  concrete implementations so that we no need to change premium calculation logic.
 *
 */
public class InsurancePremiumDiscountCalculatorAfter {

	public int calculatePremiumDiscount(CustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}

class HealthInsuranceCustomerProfileAfter implements CustomerProfile{

	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
	
}

class VehicleInsuranceCustomerProfileAfter implements CustomerProfile{

	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
	
}
