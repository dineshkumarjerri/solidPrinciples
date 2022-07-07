package com.jerri.openc;

import java.util.Random;

/**
 * 
 * @author Dinesh J
 *
 * Open Closed Principle
 *  Software components, should be closed for modification, but open for extension.
 *  In below code if the organization wants to have vehicle insurance and calculate discount here we need to 
 *  implement one more method to calculate discount for vehicle insurance.
 *
 */
public class InsurancePremiumDiscountCalculatorBefore {

	public int calculatePremiumDiscount(HealthInsuranceCustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
	public int calculatePremiumDiscount(VehicleInsuranceCustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
}

class HealthInsuranceCustomerProfile {

	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
	
}

class VehicleInsuranceCustomerProfile {

	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
	
}



