package com.jerri.dependency.inversion;

import java.util.List;


/**
 * 
 * @author Dinesh J
 * Here {@link ProductCatalogDependencyInjection} is not worried about when to instantiate
 * dependency into it. Instead it is taken care by main application to inject dependencies.
 *
 */
public class ProductCatalogDependencyInjection {
	
	ProductRepository productRepository;
	
	public ProductCatalogDependencyInjection(ProductRepository productRepository) {
	  this.productRepository = productRepository;	
	}

	public void listALlProducts() {
		List<String> allProductNames = productRepository.getAlProductNames();
	}
}
