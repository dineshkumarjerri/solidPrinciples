package com.jerri.interfaces;


/**
 * 
 * @author Dinesh J
 * Interface Segregation Principle
 * No client should be forced to depend on methods it doesn't use.
 * Violation
 * 1. Fat Interfaces.
 * 2. Interfaces with low cohesion.
 * 3. Empty method implementations.
 *
 */
public interface IMultiFunctionInterface {

	void print();
	void printSpool();
	void scan();
	void scanPhoto();
	void fax();
	void faxInternet();
	
}

/**
 * 
 * @author Dinesh J
 * It performs all functions
 */
class XeroxWorkCenter implements IMultiFunctionInterface{

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public void printSpool() {
		// TODO Auto-generated method stub
		
	}

	public void scan() {
		// TODO Auto-generated method stub
		
	}

	public void scanPhoto() {
		// TODO Auto-generated method stub
		
	}

	public void fax() {
		// TODO Auto-generated method stub
		
	}

	public void faxInternet() {
		// TODO Auto-generated method stub
		
	}
	
}

/**
 * 
 * @author Dinesh J
 * It cannot perform fax functions
 *
 */
class HpPrinterNScanner implements IMultiFunctionInterface{

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public void printSpool() {
		// TODO Auto-generated method stub
		
	}

	public void scan() {
		// TODO Auto-generated method stub
		
	}

	public void scanPhoto() {
		// TODO Auto-generated method stub
		
	}

	public void fax() {
	
		
	}

	public void faxInternet() {
		
	}
	
}

class CanonPrinter implements IMultiFunctionInterface{

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public void printSpool() {
		// TODO Auto-generated method stub
		
	}

	public void scan() {
		// TODO Auto-generated method stub
		
	}

	public void scanPhoto() {
		// TODO Auto-generated method stub
		
	}

	public void fax() {
		// TODO Auto-generated method stub
		
	}

	public void faxInternet() {
		// TODO Auto-generated method stub
		
	}
	
}