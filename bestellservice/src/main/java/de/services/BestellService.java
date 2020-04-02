package de.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BestellService implements IBestellService {

	private IBestellDao bestellDao;
	private ICreditCardService creditCardService;
	
	
	
	
	
	public IBestellDao getBestellDao() {
		return bestellDao;
	}





	public void setBestellDao(IBestellDao bestellDao) {
		this.bestellDao = bestellDao;
	}





	public ICreditCardService getCreditCardService() {
		return creditCardService;
	}





	public void setCreditCardService(ICreditCardService creditCardService) {
		this.creditCardService = creditCardService;
	}





	@Override
	public void bestellen(String cardnumber, double amount)	throws ServerDownException, BestellServiceException,KundeIstPleiteException {
		final Pattern pattern = Pattern.compile("^(M|V)(\\d{10})$");
		
		if(cardnumber == null) throw new BestellServiceException("cardnumber must not be null");
		if(amount <= 0.0) throw new BestellServiceException("amount must be positive");
		
		Matcher matcher = pattern.matcher(cardnumber);
		if(! matcher.matches()) throw new BestellServiceException("cardnumber has wrong format");
		
		String type = matcher.group(1).equals("M") ? "MASTER" : "VISA";
		String number = matcher.group(2);
		
		if (creditCardService.checkCredit(type, number, amount)) 
			bestellDao.create();
		else
			throw new KundeIstPleiteException();
		
		
	}

}
