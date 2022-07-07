package com.jerri.interfaces;

/**
 * 
 * @author Dinesh J
 * It performs all functions
 */
public class XeroxWorkCenterAfter implements IPrint, IScan, IFax{

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
class HpPrinterNScannerAfter implements IPrint, IScan{

	public void scan() {
		// TODO Auto-generated method stub
		
	}

	public void scanPhoto() {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public void printSpool() {
		// TODO Auto-generated method stub
		
	}

	
	
}

/**
 * 
 * @author Dinesh J
 * It performs Print functions
 */
class CanonPrinterAfter implements IPrint{

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public void printSpool() {
		// TODO Auto-generated method stub
		
	}

}