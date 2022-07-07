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
 * ProductCatalogBefore -> SQLProductRepository
 * Here {@link SQLProductRepository} is low level module and {@link ProductCatalogBefore} depends on 
 * it and violating the Dependency Inversion Principle.
 */
public class ProductCatalogBefore {

	public void listALlProducts() {
		SQLProductRepository sqlProductRepository = new SQLProductRepository();
		List<String> allProductNames = sqlProductRepository.getAlProductNames();
	}
	
	
}

class SQLProductRepository {
	public List<String> getAlProductNames() {
		return Arrays.asList("soap", "toothPaste");
	}
}