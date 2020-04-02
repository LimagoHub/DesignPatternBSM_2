package de.services;

public interface IBestellService {
	
	public void bestellen(String cardnummer, double amount) throws ServerDownException, BestellServiceException, KundeIstPleiteException;

}
