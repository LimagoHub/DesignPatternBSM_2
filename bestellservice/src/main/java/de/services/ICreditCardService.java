package de.services;

public interface ICreditCardService {

	boolean checkCredit(String type, String number, double amount) throws ServerDownException;
	
}
