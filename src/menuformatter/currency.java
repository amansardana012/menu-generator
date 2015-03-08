package menuformatter;


public class currency {

	
	
String currency;

	public String currency( String country) {
		switch (country) {
		case "US":
			currency="USD";
			return currency;
			
 
		case "GB":
			currency="GBP";
			return currency;

		}
		return null;
		
	}

	
}