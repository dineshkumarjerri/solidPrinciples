package com.jerri.liskov;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Dinesh J
 * Liskov Substitution Principle
 * Objects should be replaceable with their subtypes without affecting the correctness
 * of the program
 *  To achive this follow below steps
 *  1. Break the chain(hierarchy)
 *  2. Tell, DOn't ask.
 *
 */
public class PricingUtilsBeforeAfter {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InhouseProductAfter();
		
		List<Product> produList = new ArrayList();
		produList.add(p1);
		produList.add(p2);
		produList.add(p3);
		
		for(Product product: produList) {
			/*
			 * if(product instanceof InhouseProduct) { // we are asking what kind of object
			 * it is ((InhouseProduct) product).applyExtraDiscount(); }
			 */
			System.out.println(product.getDiscount());
		}

	}

}

//class ProductAfter{
//	protected double discount=20;
//
//	public double getDiscount() {
//		return discount;
//	}
//	
//}

class InhouseProductAfter extends Product{
    
	@Override
	public double getDiscount() {
		applyExtraDiscount();
		return discount;
	}
	public void applyExtraDiscount() {
		discount =  discount * 1.5;
	}
	
}
