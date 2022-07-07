package com.jerri.dependency.inversion;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Dinesh J
 * Dependency Inversion Principle
 * High level modules should not depend on low-levem modules.
 * Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on Abstractions.
 *  
 * {@link ProductCatalogAfter} -> {@link ProductFactory}  
 * {@link ProductCatalogAfter} -> {@link ProductRepository} high level depends on abstraction
 * {@link SQLProductRepositoryAfter} -> {@link ProductRepository} low level depends on abstraction
 */
public class ProductCatalogAfter {

	public void listALlProducts() {
		ProductRepository productRepository = ProductFactory.create();
		List<String> allProductNames = productRepository.getAlProductNames();
	}
	
	
}

class ProductFactory{
	public static ProductRepository create() {
		return new SQLProductRepositoryAfter();
	}
}

class SQLProductRepositoryAfter implements ProductRepository {
	public List<String> getAlProductNames() {
		return Arrays.asList("soap", "toothPaste");
	}
}