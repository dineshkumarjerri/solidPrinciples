package com.jerri.dependency.inversion;

public class EcommerceMainApplication {

	
	public static void main(String[] args) {
		ProductRepository productRepository = ProductFactory.create();
		
		ProductCatalogDependencyInjection pCatalogDependencyInjection = 
				new ProductCatalogDependencyInjection(productRepository);
		pCatalogDependencyInjection.listALlProducts();
	}
	
}
